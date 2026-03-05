class Program16CountVowels {
    public static void main(String[] args) {
        String text = "Java Programming";
        int vowels = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }

        System.out.println("Vowel count = " + vowels);
    }
}
