import java.util.Scanner;

public class BasicProgram56StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int n = Math.abs(number);
        int temp = n;
        int sum = 0;

        if (temp == 0) {
            sum = 1;
        }

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println("Strong Number: Yes");
        } else {
            System.out.println("Strong Number: No");
        }
    }

    private static int factorial(int value) {
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
