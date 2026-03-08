public class max {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5,10};
        int max=0;
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is: "+max);
    }
}
