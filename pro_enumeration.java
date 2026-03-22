enum Color {
    RED, GREEN, BLUE, YELLOW
}

public class pro_enumeration {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        System.out.println("Colors: ");
        for (Color color : colors) {
            System.out.println(color);
        }
        
        Color selectedColor = Color.BLUE;
        System.out.println("\nSelected Color: " + selectedColor);
        System.out.println("Ordinal: " + selectedColor.ordinal());
    }
}
