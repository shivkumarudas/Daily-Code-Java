import java.util.HashMap;
public class pro_Hashmapfun {
    public static void main(String[] args) {
        // Your code here
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",150);
        map.put("usa",50);
        map.put("china",200);

        System.out.println(map.get("india"));
        System.out.println(map.containsKey("pakistan"));
        System.out.println(map.containsKey("usa"));

        map.remove("usa");
        System.out.println(map.containsKey("usa"));
        System.out.println(map.size());
        System.out.println(map.isEmpty()+" Empty");
}}