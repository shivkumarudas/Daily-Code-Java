import java.util.Scanner;

public class BasicProgram39CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.print("Enter character to count: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("No character entered.");
            scanner.close();
            return;
        }

        char target = input.charAt(0);
        int frequency = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                frequency++;
            }
        }

        System.out.println("Frequency of '" + target + "' = " + frequency);
        scanner.close();
    }
}
