import java.math.BigInteger;
import java.util.Scanner;

public class BasicProgram45NthCatalanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        BigInteger[] catalan = new BigInteger[n + 1];
        catalan[0] = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            catalan[i] = BigInteger.ZERO;
            for (int j = 0; j < i; j++) {
                catalan[i] = catalan[i].add(catalan[j].multiply(catalan[i - 1 - j]));
            }
        }

        System.out.println(n + "th Catalan number: " + catalan[n]);
    }
}
