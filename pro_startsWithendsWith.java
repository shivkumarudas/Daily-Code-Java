public class pro_startsWithendsWith {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(s.startsWith("Hello")); // true
        System.out.println(s.endsWith("World"));   // true
        System.out.println(s.startsWith("world")); // false
        System.out.println(s.endsWith("Hello"));   // false
    }
}   