public class pro_nestedclass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.displayOuter();
        
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayInner();
        
        OuterClass.StaticNested staticNested = new OuterClass.StaticNested();
        staticNested.display();
    }
}

class OuterClass {
    private String outerVar = "Outer Variable";
    
    void displayOuter() {
        System.out.println(outerVar);
    }
    
    // Non-static inner class
    class InnerClass {
        void displayInner() {
            System.out.println("Inner Class accessing: " + outerVar);
        }
    }
    
    // Static nested class
    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }
}
