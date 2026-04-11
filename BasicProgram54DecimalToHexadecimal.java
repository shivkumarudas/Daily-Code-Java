import java.util.Scanner;

public class BasicProgram54DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();

        String hexValue;
        if (number < 0) {
            hexValue = "-" + Integer.toHexString(-number).toUpperCase();
        } else {
            hexValue = Integer.toHexString(number).toUpperCase();
        }

        System.out.println("Hexadecimal value: " + hexValue);
    }
}
