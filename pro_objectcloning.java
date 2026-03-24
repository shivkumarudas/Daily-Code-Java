public class pro_objectcloning {
    static class Student implements Cloneable {
        int id;
        String name;
        
        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        
        @Override
        public String toString() {
            return "Student(" + id + ", " + name + ")";
        }
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Student original = new Student(1, "Alice");
        System.out.println("Original: " + original);
        
        Student cloned = (Student) original.clone();
        System.out.println("Cloned: " + cloned);
        
        System.out.println("Are they the same object? " + (original == cloned));
        System.out.println("Are they equal? " + (original.id == cloned.id && original.name.equals(cloned.name)));
    }
}
