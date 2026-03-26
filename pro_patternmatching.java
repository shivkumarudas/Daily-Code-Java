public class pro_patternmatching {
    public static void main(String[] args) {
        Object obj = "Hello";
        
        // Pattern matching with instanceof (Java 16+)
        if (obj instanceof String str) {
            System.out.println("String: " + str);
            System.out.println("Length: " + str.length());
        } else if (obj instanceof Integer num) {
            System.out.println("Integer: " + num);
        }
        
        // Pattern matching in switch (Java 21+)
        String result = switch (obj) {
            case String s -> "String with length " + s.length();
            case Integer i -> "Integer value " + i;
            case null -> "Null value";
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}
