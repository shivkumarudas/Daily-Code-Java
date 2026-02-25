import java.util.HashMap;

public class pro_frequencyarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 3, 7, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element frequencies:");
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
