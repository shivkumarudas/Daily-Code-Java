public class pro_sumofdigits {
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + n + " is " + sum);
    }
}
