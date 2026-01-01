import java.util.Scanner;

public class pro_positive_negative {
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    if(a>=0){
        System.out.println("positive");
    }
    else{
        System.out.println("Negative");
    }
    }
}
