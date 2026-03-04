// Program to calculate average of array elements
public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.println("Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nSum: " + sum);
        System.out.println("Count: " + numbers.length);
        System.out.println("Average: " + average);
    }
}
