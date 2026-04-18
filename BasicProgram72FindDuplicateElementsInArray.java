import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicProgram72FindDuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : arr) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        boolean foundDuplicate = false;
        System.out.println("Duplicate elements:");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                foundDuplicate = true;
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }

        scanner.close();
    }
}
