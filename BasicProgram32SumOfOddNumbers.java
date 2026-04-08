import java.util.Scanner;

public class BasicProgram32SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to " + limit + " = " + sum);
        scanner.close();
    }
}
