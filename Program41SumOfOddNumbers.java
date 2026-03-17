public class Program41SumOfOddNumbers {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }
}
