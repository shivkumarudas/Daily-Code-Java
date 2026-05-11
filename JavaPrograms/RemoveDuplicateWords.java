import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        Set<String> unique = new LinkedHashSet<>();
        for (String word : sentence.split("\\s+")) {
            if (!word.isBlank()) {
                unique.add(word);
            }
        }

        System.out.println(String.join(" ", unique));
        sc.close();
    }
}
