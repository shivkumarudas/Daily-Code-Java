public class pro_secondlargestarray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 34, 45, 22};
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

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
