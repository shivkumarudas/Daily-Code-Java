// Program to check if a number is a perfect square
public class PerfectSquare {
    public static void main(String[] args) {
        int[] numbers = {16, 25, 30, 49, 100};
        
        System.out.println("Checking Perfect Squares:");
        for (int num : numbers) {
            double sqrt = Math.sqrt(num);
            if (sqrt == (int) sqrt) {
                System.out.println(num + " is a perfect square");
            } else {
                System.out.println(num + " is not a perfect square");
            }
        }
    }
}
