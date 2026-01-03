public class pro_linearsearch {
    public static void main(String[] args) {
        int numb[]={10,20,30,40,50,60,70,80,90};
        int key=70;
        for(int i=0;i<numb.length;i++){
            if(numb[i]==key){
                System.out.println("Key found at index: "+i);
                break;
            }
        }
    }
}
