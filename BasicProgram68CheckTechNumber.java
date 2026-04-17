import java.util.Scanner;

public class BasicProgram68CheckTechNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println(number + " is not a Tech Number.");
            scanner.close();
            return;
        }

        String text = Integer.toString(number);

        if (text.length() % 2 != 0) {
            System.out.println(number + " is not a Tech Number.");
            scanner.close();
            return;
        }

        int mid = text.length() / 2;
        int firstHalf = Integer.parseInt(text.substring(0, mid));
        int secondHalf = Integer.parseInt(text.substring(mid));
        int sum = firstHalf + secondHalf;

        if (sum * sum == number) {
            System.out.println(number + " is a Tech Number.");
        } else {
            System.out.println(number + " is not a Tech Number.");
        }

        scanner.close();
    }
}

