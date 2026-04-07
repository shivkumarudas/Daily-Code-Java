import java.util.Scanner;

public class BasicProgram26SecondLargestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        if (n < 2 || secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
        scanner.close();
    }
}
