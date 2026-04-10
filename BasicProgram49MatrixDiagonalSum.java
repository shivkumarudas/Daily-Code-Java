import java.util.Scanner;

public class BasicProgram49MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size (n for n x n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive size.");
            return;
        }

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }

        int totalDiagonalSum = primarySum + secondarySum;
        if (n % 2 == 1) {
            totalDiagonalSum -= matrix[n / 2][n / 2];
        }

        System.out.println("Primary diagonal sum: " + primarySum);
        System.out.println("Secondary diagonal sum: " + secondarySum);
        System.out.println("Total diagonal sum: " + totalDiagonalSum);
    }
}
