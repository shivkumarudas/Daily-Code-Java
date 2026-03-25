import java.util.*;

public class pro_treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(5, "Five");
        
        System.out.println("TreeMap (sorted by keys): " + map);
        
        // Get first and last keys
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        
        // Get range of keys
        System.out.println("SubMap (2 to 4): " + map.subMap(2, 4));
        
        // Iterate in order
        System.out.println("Iterating in order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
