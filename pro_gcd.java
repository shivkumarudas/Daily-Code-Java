public class pro_gcd {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("GCD of " + a + " and " + b + " is " + x);
    }
}
