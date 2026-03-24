public class pro_overloading {
    // Method 1: Add two integers
    static int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: Add two doubles
    static double add(double a, double b) {
        return a + b;
    }
    
    // Method 4: Concatenate strings
    static String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println("Add two integers: " + add(5, 10));
        System.out.println("Add three integers: " + add(5, 10, 15));
        System.out.println("Add two doubles: " + add(5.5, 10.5));
        System.out.println("Concatenate strings: " + add("Hello ", "World"));
    }
}
