import java.util.Scanner;

public class BasicProgram65CheckPronicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println(number + " is not a Pronic Number.");
            scanner.close();
            return;
        }

        boolean isPronic = false;
        for (int i = 0; i * (i + 1) <= number; i++) {
            if (i * (i + 1) == number) {
                isPronic = true;
                break;
            }
        }

        if (isPronic) {
            System.out.println(number + " is a Pronic Number.");
        } else {
            System.out.println(number + " is not a Pronic Number.");
        }

        scanner.close();
    }
}

