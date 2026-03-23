public class pro_integertostring {
    public static void main(String[] args) {
        // Integer to String
        int num = 123;
        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);
        String str3 = "" + num;
        
        System.out.println("Using String.valueOf(): " + str1);
        System.out.println("Using Integer.toString(): " + str2);
        System.out.println("Using concatenation: " + str3);
        
        // String to Integer
        String numStr = "456";
        int number = Integer.parseInt(numStr);
        System.out.println("String to Integer: " + number);
        
        // Hex to Integer
        String hexStr = "FF";
        int hexNum = Integer.parseInt(hexStr, 16);
        System.out.println("Hex to Integer: " + hexNum);
    }
}
