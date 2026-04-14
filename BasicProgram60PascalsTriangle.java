import java.util.Scanner;

public class BasicProgram60PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive number of rows.");
            return;
        }

        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print(" ");
            }

            long value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
