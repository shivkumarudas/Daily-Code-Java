import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }

        System.out.println(n == 1 ? "Happy Number" : "Not a Happy Number");
        sc.close();
    }
}
