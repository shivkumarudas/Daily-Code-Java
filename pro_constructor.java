public class pro_constructor {
    String name;
    int age;

    // Constructor to initialize the object
    public pro_constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using the constructor
        pro_constructor person1 = new pro_constructor("Alice", 30);
        pro_constructor person2 = new pro_constructor("Bob", 25);

        // Displaying information of the objects
        person1.displayInfo();
        person2.displayInfo();
    }
}
