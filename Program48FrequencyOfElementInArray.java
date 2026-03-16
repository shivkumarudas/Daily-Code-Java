public class Program48FrequencyOfElementInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6, 2, 8, 4, 2};
        int target = 2;
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Element " + target + " appears " + count + " times.");
    }
}
