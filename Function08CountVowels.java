public class Function08CountVowels {
    static int countVowels(String text) {
        int count = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Java Functions";
        System.out.println("Vowel count = " + countVowels(text));
    }
}
