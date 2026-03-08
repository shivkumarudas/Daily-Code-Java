public class Program24BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "11001";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
    }
}
