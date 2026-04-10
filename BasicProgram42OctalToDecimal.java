import java.util.Scanner;

public class BasicProgram42OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine().trim();

        if (octal.isEmpty()) {
            System.out.println("Invalid octal number.");
            return;
        }

        boolean isNegative = octal.charAt(0) == '-';
        String value = isNegative ? octal.substring(1) : octal;

        if (value.isEmpty()) {
            System.out.println("Invalid octal number.");
            return;
        }

        int decimal = 0;
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (ch < '0' || ch > '7') {
                System.out.println("Invalid octal number.");
                return;
            }
            decimal = decimal * 8 + (ch - '0');
        }

        if (isNegative) {
            decimal = -decimal;
        }

        System.out.println("Decimal: " + decimal);
    }
}
