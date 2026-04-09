import java.util.Scanner;

public class BasicProgram37PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start value: ");
        int start = scanner.nextInt();
        System.out.print("Enter end value: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
