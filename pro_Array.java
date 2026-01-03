public class pro_Array { 
    public static void main(String[] args){
        int marks[]=new int[5];
        int numbers[]={1,2,3,4,5};
        String fruits[]={"Apple","Bannana","Mango","Orange"};
        marks[0]=50;
        marks[1]=55;
        marks[2]=65;
        marks[3]=62;
        marks[4]=98;
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }   
        
    }
}