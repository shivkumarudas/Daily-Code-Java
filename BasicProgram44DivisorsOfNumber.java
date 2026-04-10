import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BasicProgram44DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i != number / i) {
                    divisors.add(number / i);
                }
            }
        }

        Collections.sort(divisors);
        System.out.println("Divisors: " + divisors);
    }
}
