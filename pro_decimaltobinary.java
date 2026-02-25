public class pro_decimaltobinary {
    public static void main(String[] args) {
        int num = 25;
        int original = num;
        StringBuilder binary = new StringBuilder();

        if (num == 0) {
            binary.append("0");
        } else {
            while (num > 0) {
                binary.append(num % 2);
                num /= 2;
            }
            binary.reverse();
        }

        System.out.println("Binary of " + original + " is " + binary);
    }
}
