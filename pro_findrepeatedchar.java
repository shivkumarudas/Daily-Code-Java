import java.util.HashSet;

public class pro_findrepeatedchar {
    public static void main(String[] args) {
        String text = "programming";
        HashSet<Character> seen = new HashSet<>();
        Character repeated = null;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (seen.contains(ch)) {
                repeated = ch;
                break;
            }
            seen.add(ch);
        }

        if (repeated != null) {
            System.out.println("First repeated character: " + repeated);
        } else {
            System.out.println("No repeated character found");
        }
    }
}
