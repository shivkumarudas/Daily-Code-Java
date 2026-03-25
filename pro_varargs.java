public class pro_varargs {
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    static void printNames(String... names) {
        System.out.println("Names:");
        for (String name : names) {
            System.out.println("- " + name);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3: " + sum(1, 2, 3));
        System.out.println("Sum of 10, 20, 30, 40: " + sum(10, 20, 30, 40));
        System.out.println("Sum of no arguments: " + sum());
        
        printNames("Alice", "Bob", "Charlie");
        printNames("Diana");
    }
}
