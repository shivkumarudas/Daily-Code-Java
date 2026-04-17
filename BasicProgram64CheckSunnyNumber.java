import java.util.Scanner;

public class BasicProgram64CheckSunnyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Sunny number is defined for non-negative integers.");
            scanner.close();
            return;
        }

        int next = number + 1;
        int root = (int) Math.sqrt(next);

        if (root * root == next) {
            System.out.println(number + " is a Sunny Number.");
        } else {
            System.out.println(number + " is not a Sunny Number.");
        }

        scanner.close();
    }
}

