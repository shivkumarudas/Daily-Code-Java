public class PrimeCheck {
    public static void main(String[] args) {
        int n = 29;
        boolean prime = n > 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");
    }
}
