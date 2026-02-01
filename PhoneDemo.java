class Smartphone {
    String brand;
    boolean isOn = false; // Default state is off

    void powerOn() {
        isOn = true;
        System.out.println(brand + " is starting up...");
    }

    void powerOff() {
        isOn = false;
        System.out.println(brand + " is shutting down...");
    }

    void makeCall(String number) {
        if (isOn) {
            System.out.println("Calling " + number + "...");
        } else {
            System.out.println("Phone is off! Cannot call.");
        }
    }
}

public class PhoneDemo {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.brand = "Samsung Galaxy";

        phone.makeCall("123-456"); // Will fail
        
        phone.powerOn();           // Turn it on
        phone.makeCall("123-456"); // Will work now
    }
}