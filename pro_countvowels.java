public class pro_countvowels {
    public static void main(String[] args) {
        String text = "Hello Java Programming";
        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Text: " + text);
        System.out.println("Number of vowels: " + vowels);
    }
}
