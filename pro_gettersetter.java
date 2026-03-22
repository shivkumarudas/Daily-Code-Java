public class pro_gettersetter {
    static class Person {
        private String name;
        private int age;
        
        // Getters
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        // Setters
        public void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            }
        }
        
        public void setAge(int age) {
            if (age > 0 && age < 150) {
                this.age = age;
            }
        }
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
