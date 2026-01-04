public class pro_subarray {
     public static void Subarry(int arr[]){
        int ts=0;
        for(int i=0; i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
               
                System.out.print(arr[k]);
            }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total Subarray="+ts);
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        Subarry(arr);
    }
}
