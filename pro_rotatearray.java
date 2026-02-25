import java.util.Arrays;

public class pro_rotatearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println("Array after right rotation by " + k + ": " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
