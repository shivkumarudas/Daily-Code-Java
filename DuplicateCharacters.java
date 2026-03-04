// Program to find duplicate characters in a string
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("String: " + str);
        System.out.println("Duplicate characters:");
        
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(str.charAt(i) + " appears " + (count + 1) + " times");
            }
        }
    }
}
