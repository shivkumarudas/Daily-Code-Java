import java.util.*;

public class pro_linkedlistoperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        
        System.out.println("LinkedList: " + list);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        
        list.addFirst("Apricot");
        list.addLast("Elderberry");
        System.out.println("After adding: " + list);
        
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing: " + list);
        
        // Iterate forward
        System.out.println("Forward iteration:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
