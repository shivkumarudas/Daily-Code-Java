// Program to find common elements in two arrays
public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9};
        
        System.out.println("Array 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nArray 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nCommon Elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
