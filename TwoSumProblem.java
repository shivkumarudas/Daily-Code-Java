// Two Sum Problem - Find two numbers that add up to target
import java.util.HashMap;
import java.util.Arrays;

public class TwoSumProblem {
    
    // Method 1: Brute Force - O(n^2)
    public static int[] twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    
    // Method 2: Using HashMap - O(n)
    public static int[] twoSumHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(arr[i], i);
        }
        
        return new int[]{-1, -1};
    }
    
    // Method 3: Two Pointer (for sorted array) - O(n)
    public static int[] twoSumTwoPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{-1, -1};
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3};
        int target = 9;
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        
        int[] result1 = twoSumBruteForce(arr, target);
        System.out.println("Brute Force (indices): " + Arrays.toString(result1));
        if (result1[0] != -1) {
            System.out.println("Values: " + arr[result1[0]] + " + " + arr[result1[1]] + " = " + target);
        }
        
        int[] result2 = twoSumHashMap(arr, target);
        System.out.println("\nHashMap (indices): " + Arrays.toString(result2));
        if (result2[0] != -1) {
            System.out.println("Values: " + arr[result2[0]] + " + " + arr[result2[1]] + " = " + target);
        }
        
        int[] sortedArr = {2, 3, 7, 11, 15};
        int[] result3 = twoSumTwoPointer(sortedArr, target);
        System.out.println("\nTwo Pointer (indices): " + Arrays.toString(result3));
        if (result3[0] != -1) {
            System.out.println("Values: " + sortedArr[result3[0]] + " + " + sortedArr[result3[1]] + " = " + target);
        }
    }
}
