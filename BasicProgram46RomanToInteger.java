import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicProgram46RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().trim().toUpperCase();

        if (roman.isEmpty()) {
            System.out.println("Invalid Roman numeral.");
            return;
        }

        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int prev = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char ch = roman.charAt(i);
            if (!values.containsKey(ch)) {
                System.out.println("Invalid Roman numeral.");
                return;
            }
            int current = values.get(ch);

            if (current < prev) {
                total -= current;
            } else {
                total += current;
                prev = current;
            }
        }

        System.out.println("Integer: " + total);
    }
}
