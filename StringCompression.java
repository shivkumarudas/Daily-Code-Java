// String Compression - Convert "aaabbbccd" to "a3b3c2d1"
public class StringCompression {
    
    public static String compressString(String str) {
        if (str == null || str.length() == 0)
            return "";
        
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < str.length(); i++) {
            // If next character is different or we're at the end
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        
        return compressed.toString();
    }
    
    public static String decompressString(String str) {
        StringBuilder decompressed = new StringBuilder();
        int i = 0;
        
        while (i < str.length()) {
            char ch = str.charAt(i);
            int j = i + 1;
            
            // Collect all digits
            while (j < str.length() && Character.isDigit(str.charAt(j))) {
                j++;
            }
            
            int count = Integer.parseInt(str.substring(i + 1, j));
            for (int k = 0; k < count; k++) {
                decompressed.append(ch);
            }
            
            i = j;
        }
        
        return decompressed.toString();
    }
    
    public static void main(String[] args) {
        String original = "aaabbbccd";
        String compressed = compressString(original);
        String decompressed = decompressString(compressed);
        
        System.out.println("Original: " + original);
        System.out.println("Compressed: " + compressed);
        System.out.println("Decompressed: " + decompressed);
        
        System.out.println("\nAnother example:");
        String test = "aabbcccdddd";
        System.out.println("Original: " + test);
        System.out.println("Compressed: " + compressString(test));
    }
}
