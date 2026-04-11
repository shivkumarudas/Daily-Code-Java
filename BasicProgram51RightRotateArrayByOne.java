import java.util.Scanner;

public class BasicProgram51RightRotateArrayByOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive size.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int last = array[n - 1];
        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;

        System.out.println("Array after right rotation by one:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
