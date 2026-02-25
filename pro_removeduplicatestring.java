public class pro_removeduplicatestring {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        System.out.println("Original string: " + input);
        System.out.println("After removing duplicates: " + result);
    }
}
