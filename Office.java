class Employee {
    int empId;
    String name;
    double salary;
    String department;

    void displayDetails() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("-----------------");
    }
}

public class Office {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 55;
        e1.name = "Sarah Smith";
        e1.salary = 60000;
        e1.department = "IT";

        Employee e2 = new Employee();
        e2.empId = 56;
        e2.name = "Mike Ross";
        e2.salary = 62000;
        e2.department = "HR";

        e1.displayDetails();
        e2.displayDetails();
    }
}