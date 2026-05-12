import java.util.Scanner;

public class ValidateIPv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP: ");
        String ip = sc.nextLine();

        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            System.out.println("Invalid");
            sc.close();
            return;
        }

        for (String part : parts) {
            if (part.isEmpty() || (part.length() > 1 && part.startsWith("0"))) {
                System.out.println("Invalid");
                sc.close();
                return;
            }

            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    System.out.println("Invalid");
                    sc.close();
                    return;
                }
            }

            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                System.out.println("Invalid");
                sc.close();
                return;
            }
        }

        System.out.println("Valid");
        sc.close();
    }
}
