public class pro_classtoprimitive {
    public static void main(String[] args) {
        // String to Integer
        String str1 = "123";
        Integer num = Integer.parseInt(str1);
        System.out.println("String to Integer: " + num);
        
        // String to Double
        String str2 = "45.67";
        Double decimal = Double.parseDouble(str2);
        System.out.println("String to Double: " + decimal);
        
        // String to Boolean
        String str3 = "true";
        Boolean bool = Boolean.parseBoolean(str3);
        System.out.println("String to Boolean: " + bool);
        
        // Integer to String
        Integer num2 = 999;
        String str4 = num2.toString();
        System.out.println("Integer to String: " + str4);
    }
}
