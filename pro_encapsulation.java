class Student {
    private int id;
    private String name;
    private double gpa;
    
    // Constructor
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    
    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    
    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    
    @Override
    public String toString() {
        return "Student(" + id + ", " + name + ", " + gpa + ")";
    }
}

public class pro_encapsulation {
    public static void main(String[] args) {
        Student student = new Student(1, "Alice", 3.8);
        System.out.println(student);
        student.setGpa(3.9);
        System.out.println("Updated GPA: " + student.getGpa());
    }
}
