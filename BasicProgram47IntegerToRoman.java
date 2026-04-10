import java.util.Scanner;

public class BasicProgram47IntegerToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-3999): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 3999) {
            System.out.println("Please enter a number between 1 and 3999.");
            return;
        }

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
        }

        System.out.println("Roman numeral: " + roman);
    }
}
