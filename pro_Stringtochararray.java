public class pro_Stringtochararray {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
