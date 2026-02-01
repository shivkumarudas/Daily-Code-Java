class Rectangle {
    int length;
    int width;

    // Method to calculate and return area
    int calculateArea() {
        return length * width;
    }
    
    // Method to calculate perimeter
    int calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 10;
        rect.width = 5;

        // Call method and store the result
        int area = rect.calculateArea();
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}