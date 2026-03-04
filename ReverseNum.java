// Program to reverse a number
public class ReverseNum {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        int original = num;
        
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);
    }
}
