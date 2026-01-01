import java.util.Scanner;
public class pro_largest3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a first number");
    int a=sc.nextInt();
      System.out.println("Enter a second number");
    int b=sc.nextInt();
      System.out.println("Enter a Third number");
    int c=sc.nextInt();
  
    if(a>b && a>c){
        System.out.println("A is Largest");
    }
    else if(b>c){
        System.out.println("B is Largest");
    }
    else{ 
        System.out.println("C is Largest");
    }
  }
}