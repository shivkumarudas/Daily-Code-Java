class Pro_binomialcoe {
    public static int fact(int n){
     int f=1;
    for(int i=1;i<=n;i++){
       f=f*i; 
    }
        return f;
    }
    public static int binomialCoe(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);

        int binom=a/(b*c);
        return binom;
    }
public static void main(String[] args){
  System.out.println(binomialCoe(5,2));
    }
}

