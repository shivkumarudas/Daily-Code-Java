import java.util.Scanner;

public class BasicProgram53CheckAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (first.length() != second.length()) {
            System.out.println("Anagram: No");
            return;
        }

        int[] frequency = new int[256];
        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i)]++;
            frequency[second.charAt(i)]--;
        }

        for (int count : frequency) {
            if (count != 0) {
                System.out.println("Anagram: No");
                return;
            }
        }

        System.out.println("Anagram: Yes");
    }
}
