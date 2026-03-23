import java.util.*;

public class pro_mapiterator {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        scores.put("Diana", 88);
        
        // Using entrySet for better performance
        System.out.println("Using entrySet:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // Using keySet
        System.out.println("\nUsing keySet:");
        for (String name : scores.keySet()) {
            System.out.println(name + " -> " + scores.get(name));
        }
        
        // Using values
        System.out.println("\nUsing values:");
        for (Integer score : scores.values()) {
            System.out.println(score);
        }
    }
}
