// Stack Implementation using Array
public class StackImplementation {
    private int[] stack;
    private int top;
    private int capacity;
    
    // Constructor
    public StackImplementation(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }
    
    // Push element to stack
    public void push(int x) {
        if (top >= capacity - 1) {
            System.out.println("Stack overflow! Cannot push " + x);
            return;
        }
        stack[++top] = x;
        System.out.println("Pushed: " + x);
    }
    
    // Pop element from stack
    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow!");
            return -1;
        }
        return stack[top--];
    }
    
    // Peek element
    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return top < 0;
    }
    
    // Get size
    public int size() {
        return top + 1;
    }
    
    // Display stack
    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        StackImplementation s = new StackImplementation(5);
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        
        s.display();
        
        System.out.println("Peek: " + s.peek());
        System.out.println("Size: " + s.size());
        
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        
        s.display();
    }
}
