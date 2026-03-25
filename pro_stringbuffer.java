public class pro_stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial: " + sb);
        
        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);
        
        // Replace
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Delete
        sb.reverse(); // Reverse back
        sb.delete(2, 5); // Delete "llo"
        System.out.println("After delete: " + sb);
        
        // Length and Capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
