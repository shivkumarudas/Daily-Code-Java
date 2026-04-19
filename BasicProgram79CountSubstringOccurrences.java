import java.util.Scanner;

public class BasicProgram79CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = scanner.nextLine();

        System.out.print("Enter substring to search: ");
        String pattern = scanner.nextLine();

        if (pattern.isEmpty()) {
            System.out.println("Substring cannot be empty.");
            scanner.close();
            return;
        }

        int count = 0;
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (text.substring(i, i + pattern.length()).equals(pattern)) {
                count++;
            }
        }

        System.out.println("Occurrences found: " + count);
        scanner.close();
    }
}

