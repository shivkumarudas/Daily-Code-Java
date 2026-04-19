import java.util.Arrays;
import java.util.Scanner;

public class BasicProgram77SortStringsAlphabetically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }

        String[] words = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Sorted strings:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}

