import java.util.Scanner;

public class BasicProgram63CheckNeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Neon number is defined for non-negative integers.");
            scanner.close();
            return;
        }

        long square = (long) number * number;
        int sum = 0;

        if (square == 0) {
            sum = 0;
        } else {
            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }

        scanner.close();
    }
}

