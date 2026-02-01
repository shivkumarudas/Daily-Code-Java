// 1. Define the Class (The Blueprint)
class Car {
    // Fields (Attributes)
    String brand;
    String color;
    int maxSpeed;

    // Method (Behavior)
    void drive() {
        System.out.println("The " + color + " " + brand + " is driving fast!");
    }
}

// 2. Main Class to run the program
public class Carclassobject {
    public static void main(String[] args) {
        
        // Create an Object (Instance) of Car
        Car myCar = new Car();

        // Set the values for this specific car
        myCar.brand = "Tesla";
        myCar.color = "Red";
        myCar.maxSpeed = 200;

        // Access the data
        System.out.println("My car is a " + myCar.brand);

        // Call the method (Action)
        myCar.drive(); 
    }
}