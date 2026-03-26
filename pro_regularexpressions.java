import java.util.regex.*;

public class pro_regularexpressions {
    public static void main(String[] args) {
        String text = "Email: john@example.com, Phone: 123-456-7890";
        
        // Pattern to find email
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern emailRegex = Pattern.compile(emailPattern);
        Matcher emailMatcher = emailRegex.matcher(text);
        
        System.out.println("Emails found:");
        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }
        
        // Pattern to find phone numbers
        String phonePattern = "\\d{3}-\\d{3}-\\d{4}";
        Pattern phoneRegex = Pattern.compile(phonePattern);
        Matcher phoneMatcher = phoneRegex.matcher(text);
        
        System.out.println("\nPhone numbers found:");
        while (phoneMatcher.find()) {
            System.out.println(phoneMatcher.group());
        }
    }
}
