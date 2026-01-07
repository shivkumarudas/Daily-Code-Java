import java.util.Arrays;
import java.util.Collections;

public class pro_inbuiltsort {
      public static void PrintArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
      public static void PrintArrr(int arrr[]){
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]);
        }
    }
  public static void main(String[] args){
        Integer arr[]={5,4,1,3,2};
        int arrr[]={5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        PrintArr(arr);
         Arrays.sort(arrr);
         System.out.println();
         PrintArrr(arrr);
        }
    }  
