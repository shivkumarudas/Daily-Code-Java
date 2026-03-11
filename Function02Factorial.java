public class Function02Factorial {
    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println("Factorial of " + number + " = " + factorial(number));
    }
}
