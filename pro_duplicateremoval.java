import java.util.*;

public class pro_duplicateremoval {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5, 5));
        System.out.println("Original List: " + list);
        
        // Using HashSet to remove duplicates
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("After removing duplicates: " + uniqueList);
        
        // Count duplicates
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : list) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency Map: " + frequency);
    }
}
