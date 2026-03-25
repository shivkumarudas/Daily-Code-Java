public class pro_typecast {
    public static void main(String[] args) {
        // Upcasting (widening)
        int num = 42;
        long longNum = num; // Implicit casting
        double doubleNum = num;
        System.out.println("int to long: " + longNum);
        System.out.println("int to double: " + doubleNum);
        
        // Downcasting (narrowing)
        long longValue = 100L;
        int intValue = (int) longValue; // Explicit casting
        System.out.println("long to int: " + intValue);
        
        double doubleValue = 3.14;
        int intValue2 = (int) doubleValue;
        System.out.println("double to int: " + intValue2);
        
        // Object casting
        Object obj = "Hello";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("Object to String: " + str);
        }
    }
}
