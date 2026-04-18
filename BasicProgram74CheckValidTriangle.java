import java.util.Scanner;

public class BasicProgram74CheckValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first side: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second side: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third side: ");
        double c = scanner.nextDouble();

        boolean isValid = a > 0 && b > 0 && c > 0 && (a + b > c) && (b + c > a) && (c + a > b);

        if (isValid) {
            System.out.println("The given sides form a valid triangle.");
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}

