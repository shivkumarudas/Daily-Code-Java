import java.util.Calendar;

public class pro_calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        System.out.println("Current Date and Time: " + calendar.getTime());
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));
    }
}
