public class pro_classobject {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "sam";
        student1.age = 20;
        student1.gender = "male"; 
        student1.displayDetails();
    }
}
class Student{
    String name;
    int age;
    String gender;
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);    
    }

}