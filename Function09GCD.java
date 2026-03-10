public class Function09GCD {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int first = 48;
        int second = 18;
        System.out.println("GCD = " + gcd(first, second));
    }
}
