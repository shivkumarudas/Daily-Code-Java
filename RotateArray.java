// Rotate Array by K positions
import java.util.Arrays;

public class RotateArray {
    
    // Method 1: Using temporary array
    public static void rotateByKSpaceMethod(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle k > n
        
        int[] temp = new int[k];
        // Copy last k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        
        // Shift elements
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        
        // Copy temp back to array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
    
    // Method 2: Reverse method (most efficient)
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void rotateByKReverseMethod(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        
        // Reverse entire array
        reverse(arr, 0, n - 1);
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }
    
    // Method 3: Using rotation logic
    public static void rotateByKLogical(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        System.out.println("Original array: " + Arrays.toString(arr1));
        
        rotateByKSpaceMethod(arr1, k);
        System.out.println("Rotated (Space Method): " + Arrays.toString(arr1));
        
        rotateByKReverseMethod(arr2, k);
        System.out.println("Rotated (Reverse Method): " + Arrays.toString(arr2));
        
        rotateByKLogical(arr3, k);
        System.out.println("Rotated (Logical Method): " + Arrays.toString(arr3));
    }
}
