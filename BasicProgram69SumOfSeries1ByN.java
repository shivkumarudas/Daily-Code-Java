import java.util.Scanner;

public class BasicProgram69SumOfSeries1ByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.printf("Sum of series (1 + 1/2 + ... + 1/%d) = %.6f%n", n, sum);
        scanner.close();
    }
}

