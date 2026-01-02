public class pro01triangle {
     public static void inve(int n){
   for(int i=1;i<=n;i++){
       for(int j=1;j<=i;j++){
           int k=i+j;
           if(k%2==0){
           System.out.print("1 ");
       }
           else{
               System.out.print("0 ");
           }
       }
       System.out.println();
   }
      }
    public static void main(String[] args){
      inve(5);
    }
}
