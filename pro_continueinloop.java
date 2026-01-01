import java.util.Scanner;

public class pro_continueinloop {
    public static void main(String[] args){
    System.out.println("Enter a number between 1 to 10:");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            if(i==num){
                continue;
            }
            System.out.println(i);
        }


    }
}
