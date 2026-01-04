public class pro_maxsubarraysum {
    public static void maxSubarry(int arr[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentsum=0;
                for(int k=start;k<=end;k++){
                    currentsum+=arr[k];
            }
            System.out.println(currentsum);
          if(maxsum<currentsum){
              maxsum=currentsum;
          }
            }
        }
         System.out.println("maxsum = "+maxsum);
    }
    public static void main(String[] args){
        int arr[]={1,-2,6,-1,3};
        maxSubarry(arr);
    }
}