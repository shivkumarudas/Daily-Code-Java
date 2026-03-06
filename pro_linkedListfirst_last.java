class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class pro_linkedListfirst_last {
    Node head;
  // Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
// Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // Display the list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
public void add(int idx,int data){
    if(idx==0){
        addFirst(data);
        return;
    }
    Node newNode=new Node(data);
    Node temp=head; 
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}
    public static void main(String[] args) {
        pro_linkedListfirst_last list = new pro_linkedListfirst_last();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.add(2,25);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Linked List:");
        list.display();
    }
}