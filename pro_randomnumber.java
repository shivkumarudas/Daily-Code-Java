import java.util.*;

public class pro_randomnumber {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Random integer between 0 and 99
        int randomInt = random.nextInt(100);
        System.out.println("Random integer (0-99): " + randomInt);
        
        // Random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Random double (0.0-1.0): " + randomDouble);
        
        // Random boolean
        boolean randomBool = random.nextBoolean();
        System.out.println("Random boolean: " + randomBool);
        
        // Generate 5 random numbers between 1 and 10
        System.out.println("5 random numbers between 1-10:");
        for (int i = 0; i < 5; i++) {
            System.out.println(1 + random.nextInt(10));
        }
    }
}
