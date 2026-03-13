public class Program33CountDigits {
    public static void main(String[] args) {
        int number = 987654;
        int temp = number;
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);
    }
}
