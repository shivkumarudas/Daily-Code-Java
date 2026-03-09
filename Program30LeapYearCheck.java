public class Program30LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        if (isLeap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
