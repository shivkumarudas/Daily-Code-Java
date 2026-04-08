import java.util.Scanner;

public class BasicProgram33CheckPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Negative numbers cannot be perfect squares.");
        } else {
            long root = (long) Math.sqrt(number);
            if (root * root == number) {
                System.out.println(number + " is a perfect square.");
            } else {
                System.out.println(number + " is not a perfect square.");
            }
        }

        scanner.close();
    }
}
