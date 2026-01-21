public class pro_lastIndexOf {
    public static void main(String[] args) {
        String s = "abcaabcaa";
        System.out.println(s.lastIndexOf("a")); // 8
        System.out.println(s.lastIndexOf("abc")); // 4
        System.out.println(s.lastIndexOf("z")); // -1
    }
}
