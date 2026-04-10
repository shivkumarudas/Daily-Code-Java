import java.util.Scanner;

public class BasicProgram41DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Octal: 0");
            return;
        }

        boolean isNegative = number < 0;
        int n = Math.abs(number);
        int octal = 0;
        int place = 1;

        while (n > 0) {
            int remainder = n % 8;
            octal += remainder * place;
            place *= 10;
            n /= 8;
        }

        if (isNegative) {
            System.out.println("Octal: -" + octal);
        } else {
            System.out.println("Octal: " + octal);
        }
    }
}
