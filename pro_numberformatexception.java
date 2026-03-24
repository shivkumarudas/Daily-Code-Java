public class pro_numberformatexception {
    public static void main(String[] args) {
        String[] numbers = {"123", "45.67", "100abc", "true", "999"};
        
        for (String num : numbers) {
            try {
                int value = Integer.parseInt(num);
                System.out.println(num + " -> Integer: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Error parsing " + num + ": Invalid format");
            }
        }
        
        System.out.println("\nParsing doubles:");
        String[] decimals = {"3.14", "2.71", "abc", "100.5"};
        for (String dec : decimals) {
            try {
                double value = Double.parseDouble(dec);
                System.out.println(dec + " -> Double: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Error parsing " + dec + ": Invalid format");
            }
        }
    }
}
