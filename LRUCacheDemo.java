import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheDemo {
    private static class LRUCache<K, V> extends LinkedHashMap<K, V> {
        private final int capacity;

        LRUCache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println("Initial cache: " + cache);

        cache.get(1);
        cache.put(4, "Four");
        System.out.println("After accessing 1 and adding 4: " + cache);

        cache.get(3);
        cache.put(5, "Five");
        System.out.println("After accessing 3 and adding 5: " + cache);
    }
}
