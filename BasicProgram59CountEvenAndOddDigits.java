import java.util.Scanner;

public class BasicProgram59CountEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int n = Math.abs(number);
        int evenCount = 0;
        int oddCount = 0;

        if (n == 0) {
            evenCount = 1;
        }

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            n /= 10;
        }

        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
    }
}
