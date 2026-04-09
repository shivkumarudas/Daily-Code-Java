import java.util.Scanner;

public class BasicProgram36AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Count must be greater than 0.");
            scanner.close();
            return;
        }

        double sum = 0;
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            sum += scanner.nextDouble();
        }

        double average = sum / count;
        System.out.println("Average = " + average);
        scanner.close();
    }
}
