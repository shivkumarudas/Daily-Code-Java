import java.util.Scanner;

public class BasicProgram62CheckDuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine().trim();

        if (!number.matches("\\d+")) {
            System.out.println("Please enter a valid non-negative integer.");
            scanner.close();
            return;
        }

        if (number.charAt(0) == '0') {
            System.out.println(number + " is not a Duck Number.");
            scanner.close();
            return;
        }

        boolean hasZero = number.indexOf('0') > 0;

        if (hasZero) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        scanner.close();
    }
}

