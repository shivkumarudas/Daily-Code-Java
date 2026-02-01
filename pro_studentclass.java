
class Student {
    int id;
    String name;

    // Method to display student info
    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class pro_studentclass {
    public static void main(String[] args) {
        // Create first student Object
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Alice";

        // Create second student Object
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Bob";

        // Each object maintains its own state
        s1.displayInfo();
        s2.displayInfo();
    }
}