import java.util.Scanner;

public class BasicProgram55HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Please enter a valid hexadecimal value.");
            return;
        }

        boolean negative = input.startsWith("-");
        String hex = negative ? input.substring(1) : input;

        try {
            int decimal = Integer.parseInt(hex, 16);
            if (negative) {
                decimal = -decimal;
            }
            System.out.println("Decimal value: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal number.");
        }
    }
}
