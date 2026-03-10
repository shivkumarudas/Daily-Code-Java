public class Function07ArrayMax {
    static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] values = {12, 7, 25, 3, 19};
        System.out.println("Maximum value = " + findMax(values));
    }
}
