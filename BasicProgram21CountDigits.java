import java.util.Scanner;

public class BasicProgram21CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int temp = Math.abs(number);
        int count = (temp == 0) ? 1 : 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }


        

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
