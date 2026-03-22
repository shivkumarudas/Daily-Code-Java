import java.util.*;

public class pro_filterstringlist {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Adam");
        
        // Filter names starting with 'A'
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                filteredNames.add(name);
            }
        }
        
        System.out.println("Original List: " + names);
        System.out.println("Filtered (starting with 'A'): " + filteredNames);
        
        // Using streams (Java 8+)
        List<String> filteredStreams = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("Using Streams: " + filteredStreams);
    }
}
