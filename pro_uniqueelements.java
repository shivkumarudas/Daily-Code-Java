import java.util.*;

public class pro_uniqueelements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5);
        System.out.println("Original list: " + list);
        
        // Method 1: Using HashSet
        Set<Integer> uniqueSet = new HashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        System.out.println("Unique elements (unordered): " + uniqueList);
        
        // Method 2: Using LinkedHashSet (maintains insertion order)
        Set<Integer> orderedSet = new LinkedHashSet<>(list);
        List<Integer> orderedList = new ArrayList<>(orderedSet);
        System.out.println("Unique elements (ordered): " + orderedList);
        
        // Method 3: Using streams
        List<Integer> streamUnique = list.stream().distinct().toList();
        System.out.println("Unique elements (using streams): " + streamUnique);
    }
}
