class Product {
    String name;
    double price;

    // Constructor (Same name as class, no return type)
    Product(String n, double p) {
        name = n;
        price = p;
    }

    void showProduct() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Creating objects while passing data directly
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Mouse", 25.50);

        p1.showProduct();
        p2.showProduct();
    }
}