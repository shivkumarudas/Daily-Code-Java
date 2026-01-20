public class pro_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "HELLO";
        String str3 = "world";
        
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); // true
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3)); // false
    }
}
