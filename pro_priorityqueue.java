import java.util.*;

public class pro_priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.add(9);
        
        System.out.println("Priority Queue (Min Heap): ");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
        
        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(8);
        maxHeap.add(1);
        maxHeap.add(9);
        
        System.out.println("\nPriority Queue (Max Heap): ");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
