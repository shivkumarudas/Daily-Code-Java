import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarraysWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int k = sc.nextInt();

        Map<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int value : arr) {
            sum += value;
            count += prefix.getOrDefault(sum - k, 0);
            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Subarrays count = " + count);
        sc.close();
    }
}
