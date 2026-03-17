public class Program44RemoveSpacesFromString {
    public static void main(String[] args) {
        String text = "Java programming is fun";
        String noSpaces = text.replace(" ", "");

        System.out.println("Original String: " + text);
        System.out.println("Without spaces: " + noSpaces);
    }
}
