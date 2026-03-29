// Remove Duplicates from Array
import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    
    // Method 1: Using HashSet
    public static int[] removeDuplicatesHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
    
    // Method 2: Two Pointer (for sorted array)
    public static int removeDuplicatesSorted(int[] arr) {
        if (arr.length == 0)
            return 0;
        
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }
        return j + 1;
    }
    
    // Method 3: Using logical approach
    public static int[] removeDuplicatesLogical(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }
        
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        int[] result1 = removeDuplicatesHashSet(arr);
        System.out.println("Using HashSet: " + Arrays.toString(result1));
        
        int[] sortedArr = {1, 2, 2, 3, 4, 4, 5, 5};
        int length = removeDuplicatesSorted(sortedArr);
        System.out.println("Using Two Pointer (length): " + length);
        
        int[] result3 = removeDuplicatesLogical(arr);
        System.out.println("Using Logical Approach: " + Arrays.toString(result3));
    }
}
