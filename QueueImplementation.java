// Queue Implementation using Array
public class QueueImplementation {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    
    // Constructor
    public QueueImplementation(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }
    
    // Enqueue operation
    public void enqueue(int x) {
        if (rear >= capacity - 1) {
            System.out.println("Queue overflow! Cannot enqueue " + x);
            return;
        }
        if (front == -1)
            front = 0;
        queue[++rear] = x;
        System.out.println("Enqueued: " + x);
    }
    
    // Dequeue operation
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue underflow!");
            return -1;
        }
        return queue[front++];
    }
    
    // Peek front element
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    
    // Check if queue is empty
    public boolean isEmpty() {
        return front > rear;
    }
    
    // Get size
    public int size() {
        if (front == -1)
            return 0;
        return rear - front + 1;
    }
    
    // Display queue
    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation(5);
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        
        q.display();
        
        System.out.println("Peek: " + q.peek());
        System.out.println("Size: " + q.size());
        
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        
        q.display();
    }
}
