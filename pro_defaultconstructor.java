public class pro_defaultconstructor {
    String name;
    int age;

    // Default Constructor to initialize the object with default values
    public pro_defaultconstructor() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using the default constructor
        pro_defaultconstructor person1 = new pro_defaultconstructor();
        pro_defaultconstructor person2 = new pro_defaultconstructor();

        // Displaying information of the objects
        person1.displayInfo();
        person2.displayInfo();
    }
}
