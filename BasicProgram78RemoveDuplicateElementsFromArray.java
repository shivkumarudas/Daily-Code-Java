import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BasicProgram78RemoveDuplicateElementsFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }

        Set<Integer> uniqueElements = new LinkedHashSet<>();
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            uniqueElements.add(scanner.nextInt());
        }

        System.out.println("Array after removing duplicates:");
        for (int value : uniqueElements) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }
}

