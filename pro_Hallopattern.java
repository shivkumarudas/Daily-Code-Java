public class pro_Hallopattern {
    public static void Hallow(int torows,int tocols){
        for(int i=1;i<=torows;i++){
            for(int j=1;j<=tocols;j++){
                if(i==1 || i == torows || j==1 || j==tocols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hallow(4,5);
    }
}
