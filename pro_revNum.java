public class pro_revNum {
    public static void main(String[] args){
        int num=10899;
        while(num>0){
            int rev=num%10;
            System.out.print(rev);
            num=num/10;
        }
    
    }
}
