import java.util.*;

public class pro_javarecords {
    record Person(String name, int age) {
        public Person {
            if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        }
    }
    
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        
        System.out.println("Person 1: " + person1.name() + ", Age: " + person1.age());
        System.out.println("Person 2: " + person2.name() + ", Age: " + person2.age());
        
        System.out.println("Equals: " + person1.equals(new Person("Alice", 30)));
        System.out.println("ToString: " + person1);
    }
}
