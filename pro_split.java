public class pro_split {
    public static void main(String[] args) {
        String s = "apple,banana,cherry";
        String[] fruits = s.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
