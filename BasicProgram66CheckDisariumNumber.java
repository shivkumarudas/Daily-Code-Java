import java.util.Scanner;

public class BasicProgram66CheckDisariumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println(number + " is not a Disarium Number.");
            scanner.close();
            return;
        }

        String text = Integer.toString(number);
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            int digit = text.charAt(i) - '0';
            sum += Math.pow(digit, i + 1);
        }

        if (sum == number) {
            System.out.println(number + " is a Disarium Number.");
        } else {
            System.out.println(number + " is not a Disarium Number.");
        }

        scanner.close();
    }
}
