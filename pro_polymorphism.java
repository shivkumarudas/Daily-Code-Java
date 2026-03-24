class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating dog food");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating fish");
    }
}

public class pro_polymorphism {
    public static void main(String[] args) {
        Animal animal;
        
        animal = new Dog();
        animal.eat();
        
        animal = new Cat();
        animal.eat();
        
        animal = new Animal();
        animal.eat();
    }
}
