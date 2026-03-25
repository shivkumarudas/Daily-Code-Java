public class pro_stringcomparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "World";
        
        // Using equals() - compares content
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));
        
        // Using == operator - compares reference
        System.out.println("\nstr1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        
        // Using equalsIgnoreCase()
        System.out.println("\nstr1.equalsIgnoreCase(\"HELLO\"): " + str1.equalsIgnoreCase("HELLO"));
        
        // Using compareTo()
        System.out.println("\nstr1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));
    }
}
