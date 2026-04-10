import java.util.Scanner;

public class BasicProgram48AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int n = Math.abs(number);
        long square = (long) n * n;

        int temp = n;
        boolean isAutomorphic = true;

        while (temp > 0) {
            if ((temp % 10) != (square % 10)) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println("Automorphic Number: Yes");
        } else {
            System.out.println("Automorphic Number: No");
        }
    }
}
