import java.util.Scanner;

public class pro_largestof2 {
        public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a first number");
    int a=sc.nextInt();
      System.out.println("Enter a second number");
    int b=sc.nextInt();
    if(a>b){
        System.out.println("A is largest");
    }
    else{
        System.out.println("B is Laegest");
    }
    }
}
