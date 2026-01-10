import java.util.HashMap;
import java.util.Set;

public class pro_iterationHashmap {
    
    public static void main(String[] args) {
        // Your code here
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",150);
        map.put("usa",50);
        map.put("china",200);
        // Iterating using for-each loop
        Set<String> keys = map.keySet();
        for (String k: keys){
            System.out.println(k + " : " + map.get(k));
        }
    
    
    }
}
