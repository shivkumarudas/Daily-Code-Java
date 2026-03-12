public class Function06PalindromeNumber {
    static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        }
        return reversed;
    }

    static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(number + " is palindrome: " + isPalindrome(number));
    }
}
