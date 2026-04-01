import java.util.ArrayList;
import java.util.List;

public class KMPStringSearch {
    private static int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        return lps;
    }

    public static List<Integer> search(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        if (pattern.isEmpty()) {
            return result;
        }

        int[] lps = buildLPS(pattern);
        int i = 0;
        int j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                result.add(i - j);
                j = lps[j - 1];
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "ababcabcabababdabcabababd";
        String pattern = "ababd";

        List<Integer> matches = search(text, pattern);
        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("Matches at indices: " + matches);
    }
}
