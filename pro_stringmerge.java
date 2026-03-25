public class pro_stringmerge {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Method 1: Using + operator
        String result1 = str1 + " " + str2;
        System.out.println("Using +: " + result1);
        
        // Method 2: Using concat()
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Using concat(): " + result2);
        
        // Method 3: Using String format
        String result3 = String.format("%s %s", str1, str2);
        System.out.println("Using format(): " + result3);
        
        // Method 4: Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        String result4 = sb.toString();
        System.out.println("Using StringBuilder: " + result4);
        
        // Method 5: Using join()
        String result5 = String.join(" ", str1, str2);
        System.out.println("Using join(): " + result5);
    }
}
