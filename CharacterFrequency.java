// Character Frequency in String
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    
    // Method 1: Using HashMap
    public static void countFrequencyHashMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        
        System.out.println("Using HashMap:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    // Method 2: Using Character Array (for a-z)
    public static void countFrequencyArray(String str) {
        int[] freq = new int[26];
        
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        
        System.out.println("\nUsing Array:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)('a' + i) + ": " + freq[i]);
            }
        }
    }
    
    // Find most frequent character
    public static char mostFrequentChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        
        char maxChar = ' ';
        int maxFreq = 0;
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        
        return maxChar;
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        
        countFrequencyHashMap(str);
        countFrequencyArray(str);
        
        System.out.println("\nMost frequent character: " + mostFrequentChar(str));
    }
}
