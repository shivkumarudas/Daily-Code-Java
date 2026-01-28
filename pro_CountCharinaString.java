public class pro_CountCharinaString {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }}}
