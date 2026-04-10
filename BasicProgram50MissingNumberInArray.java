import java.util.Scanner;

public class BasicProgram50MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n (array should contain numbers from 1 to n with one missing): ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Please enter n greater than 1.");
            return;
        }

        int xorAll = 0;
        int xorArray = 0;

        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        System.out.println("Enter " + (n - 1) + " numbers:");
        for (int i = 0; i < n - 1; i++) {
            xorArray ^= scanner.nextInt();
        }

        int missing = xorAll ^ xorArray;
        System.out.println("Missing number: " + missing);
    }
}
