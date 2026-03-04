// Program to find second largest element in array
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 3, 25, 8};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nLargest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
