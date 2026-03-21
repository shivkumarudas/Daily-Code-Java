import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }
    
    @Override
    public String toString() {
        return "Student(" + id + ", " + name + ")";
    }
}

public class pro_comparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Charlie"));
        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));
        
        System.out.println("Before sorting: " + students);
        Collections.sort(students);
        System.out.println("After sorting by ID: " + students);
    }
}
