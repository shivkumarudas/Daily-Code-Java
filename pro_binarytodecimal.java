public class pro_binarytodecimal {
    public static void main(String[] args) {
        String binary = "101101";
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }

        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
    }
}
