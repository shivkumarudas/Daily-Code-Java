import java.util.*;

public class pro_lambdaexpression {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filter even numbers using lambda
        List<Integer> evenNumbers = new ArrayList<>();
        numbers.forEach(n -> {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        });
        System.out.println("Even Numbers: " + evenNumbers);
        
        // Map to squares using lambda
        List<Integer> squares = new ArrayList<>();
        numbers.forEach(n -> squares.add(n * n));
        System.out.println("Squares: " + squares);
        
        // Sum using lambda
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum: " + sum);
    }
}
