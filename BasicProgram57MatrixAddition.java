import java.util.Scanner;

public class BasicProgram57MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Please enter positive dimensions.");
            return;
        }

        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
