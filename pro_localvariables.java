public class pro_localvariables {
    public static void main(String[] args) {
        // Local variable in main method
        int x = 10;
        String name = "Alice";
        
        {
            // Local variable in block
            int y = 20;
            System.out.println("x = " + x + ", y = " + y);
            System.out.println("name = " + name);
        }
        
        // y is not accessible here (out of scope)
        System.out.println("x = " + x);
        System.out.println("name = " + name);
        
        for (int i = 0; i < 3; i++) {
            // i is local to the for loop
            System.out.println("i = " + i);
        }
        // i is not accessible here
    }
    
    static void methodExample() {
        // Local variables in method
        double salary = 50000.0;
        boolean isActive = true;
        System.out.println("Salary: " + salary + ", Active: " + isActive);
    }
}
