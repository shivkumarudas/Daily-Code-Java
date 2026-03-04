// Program to calculate sum of digits
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        
        // Method 1: Using while loop
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Number: " + num);
        System.out.println("Sum of digits: " + sum);
        
        // Method 2: Using recursion
        System.out.println("Sum using recursion: " + sumOfDigitsRecursive(num));
    }
    
    static int sumOfDigitsRecursive(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigitsRecursive(n / 10);
    }
}
