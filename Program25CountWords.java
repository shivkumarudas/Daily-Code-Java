public class Program25CountWords {
    public static void main(String[] args) {
        String text = "Java is fun and easy to learn";
        String[] words = text.trim().split("\\s+");
        System.out.println("Text: " + text);
        System.out.println("Word count: " + words.length);
    }
}
