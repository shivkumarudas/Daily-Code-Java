import java.util.Scanner;

public class BasicProgram52CountWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        int wordCount;
        if (sentence.isEmpty()) {
            wordCount = 0;
        } else {
            wordCount = sentence.split("\\s+").length;
        }

        System.out.println("Number of words: " + wordCount);
    }
}
