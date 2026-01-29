public class pro_classobj {
    String name;
    int age;

    public pro_classobj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        pro_classobj person1 = new pro_classobj("Alice", 30);
        pro_classobj person2 = new pro_classobj("Bob", 25);

        person1.displayInfo();
        person2.displayInfo();
    }   
}
