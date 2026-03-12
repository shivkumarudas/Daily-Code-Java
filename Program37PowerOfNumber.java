public class Program37PowerOfNumber {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 8;
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to " + exponent + " is: " + result);
    }
}
