public class pro_staticmethod {
    static int counter = 0;
    
    static void increment() {
        counter++;
        System.out.println("Counter: " + counter);
    }
    
    static int add(int a, int b) {
        return a + b;
    }
    
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    public static void main(String[] args) {
        increment();
        increment();
        increment();
        
        System.out.println("Sum: " + add(10, 20));
        greet("Alice");
        
        // Static methods can be called without creating an object
        System.out.println("Current counter: " + counter);
    }
}
