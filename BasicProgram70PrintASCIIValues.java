import java.util.Scanner;

public class BasicProgram70PrintASCIIValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start character: ");
        char start = scanner.next().charAt(0);

        System.out.print("Enter end character: ");
        char end = scanner.next().charAt(0);

        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Character -> ASCII value");
        for (char ch = start; ch <= end; ch++) {
            System.out.println(ch + " -> " + (int) ch);
        }

        scanner.close();
    }
}

