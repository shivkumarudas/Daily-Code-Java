import java.util.*;

public class pro_collectionsorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));
        System.out.println("Original List: " + list);
        
        Collections.sort(list);
        System.out.println("Sorted Ascending: " + list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted Descending: " + list);
        
        List<String> strings = new ArrayList<>(Arrays.asList("Zebra", "Apple", "Mango"));
        Collections.sort(strings);
        System.out.println("Sorted Strings: " + strings);
    }
}
