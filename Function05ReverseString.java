public class Function05ReverseString {
    static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        String word = "function";
        System.out.println("Reversed string: " + reverse(word));
    }
}
