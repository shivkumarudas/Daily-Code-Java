import java.util.Scanner;

public class pro_ladderifelse {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int a=sc.nextInt();
if(a>75){
    System.out.println("Passed With First class");
}
else if(a>65){
    System.out.println("Passed with second class");
}
else if(a>35){
    System.out.println("Passed with second class");
}
else{
    System.out.println("Fail");
}
    }
}
