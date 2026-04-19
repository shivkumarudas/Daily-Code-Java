import java.util.Scanner;

public class BasicProgram76CheckPangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        boolean[] present = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean letterFound : present) {
            if (!letterFound) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is not a Pangram.");
        }

        scanner.close();
    }
}

