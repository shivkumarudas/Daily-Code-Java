import java.util.Scanner;

public class BasicProgram43HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Harshad Number: No");
            return;
        }

        int n = number;
        int sumOfDigits = 0;

        while (n > 0) {
            sumOfDigits += n % 10;
            n /= 10;
        }

        if (number % sumOfDigits == 0) {
            System.out.println("Harshad Number: Yes");
        } else {
            System.out.println("Harshad Number: No");
        }
    }
}
