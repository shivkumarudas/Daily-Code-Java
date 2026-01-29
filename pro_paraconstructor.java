public class pro_paraconstructor {
    String name;
    int age;

    // Parameterized Constructor to initialize the object
    public pro_paraconstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        pro_paraconstructor person1 = new pro_paraconstructor("Alice", 30);
        pro_paraconstructor person2 = new pro_paraconstructor("Bob", 25);

        // Displaying information of the objects
        person1.displayInfo();
        person2.displayInfo();
    }
}
