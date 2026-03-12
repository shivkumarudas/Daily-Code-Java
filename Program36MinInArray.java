public class Program36MinInArray {
    public static void main(String[] args) {
        int[] arr = {14, 9, 27, 3, 18, 6};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum value in array is: " + min);
    }
}
