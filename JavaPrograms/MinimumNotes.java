import java.util.Scanner;

public class MinimumNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount %= note;
                System.out.println(note + " x " + count);
            }
        }
        sc.close();
    }
}
