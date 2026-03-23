import java.util.*;

public class pro_keyset {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        
        // Get all keys
        Set<Integer> keys = map.keySet();
        System.out.println("All keys: " + keys);
        
        // Iterate over keys
        System.out.println("Iterating over keys:");
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Check if key exists
        System.out.println("Contains key 3: " + keys.contains(3));
        System.out.println("Contains key 5: " + keys.contains(5));
    }
}
