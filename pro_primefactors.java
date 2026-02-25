public class pro_primefactors {
    public static void main(String[] args) {
        int n = 84;

        System.out.print("Prime factors of " + n + ": ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
