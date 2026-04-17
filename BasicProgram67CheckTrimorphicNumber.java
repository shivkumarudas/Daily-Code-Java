import java.util.Scanner;

public class BasicProgram67CheckTrimorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println(number + " is not a Trimorphic Number.");
            scanner.close();
            return;
        }

        long cube = (long) number * number * number;
        String numberText = Integer.toString(number);
        String cubeText = Long.toString(cube);

        if (cubeText.endsWith(numberText)) {
            System.out.println(number + " is a Trimorphic Number.");
        } else {
            System.out.println(number + " is not a Trimorphic Number.");
        }

        scanner.close();
    }
}

