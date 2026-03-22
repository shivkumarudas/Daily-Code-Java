import java.time.*;
import java.time.format.DateTimeFormatter;

public class pro_datetimeapi {
    public static void main(String[] args) {
        // Current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
        
        // Current time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);
        
        // Date and Time together
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + dateTime);
        
        // Custom formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted = today.format(formatter);
        System.out.println("Formatted Date: " + formatted);
        
        // Adding days
        LocalDate futureDate = today.plusDays(10);
        System.out.println("10 days from now: " + futureDate);
    }
}
