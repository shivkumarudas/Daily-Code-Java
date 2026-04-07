import java.util.Scanner;

public class BasicProgram29RemoveSpacesFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String result = text.replace(" ", "");
        System.out.println("String without spaces: " + result);
        scanner.close();
    }
}
