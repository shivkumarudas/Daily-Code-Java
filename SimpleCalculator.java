// Program for simple calculator
public class SimpleCalculator {
    
    static double add(double a, double b) {
        return a + b;
    }
    
    static double subtract(double a, double b) {
        return a - b;
    }
    
    static double multiply(double a, double b) {
        return a * b;
    }
    
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 5;
        
        System.out.println("Simple Calculator");
        System.out.println("=================");
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
    }
}
