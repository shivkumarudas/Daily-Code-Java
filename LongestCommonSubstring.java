// Longest Common Substring
public class LongestCommonSubstring {
    
    // Method 1: Brute Force
    public static String longestCommonSubstringBrute(String str1, String str2) {
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        String longest = "";
        
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(i, j);
                
                if (str2.contains(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        
        return longest;
    }
    
    // Method 2: Dynamic Programming - O(m*n)
    public static String longestCommonSubstringDP(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        int endPos = 0;
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endPos = i;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        
        return str1.substring(endPos - maxLength, endPos);
    }
    
    // Method 3: Find all common substrings
    public static void findAllCommonSubstrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        System.out.println("All Common Substrings:");
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    
                    // Print substring when it ends
                    if (dp[i][j] > 0) {
                        String substring = str1.substring(i - dp[i][j], i);
                        System.out.print(substring + " ");
                    }
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        String str1 = "ABCDXYZ";
        String str2 = "XYZABCD";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        
        String result1 = longestCommonSubstringBrute(str1, str2);
        System.out.println("\nUsing Brute Force: " + result1);
        
        String result2 = longestCommonSubstringDP(str1, str2);
        System.out.println("Using Dynamic Programming: " + result2);
        
        System.out.println();
        findAllCommonSubstrings(str1, str2);
        
        System.out.println("\n--- Another Example ---");
        String str3 = "AGGTAB";
        String str4 = "GXTXAYB";
        
        System.out.println("String 1: " + str3);
        System.out.println("String 2: " + str4);
        System.out.println("Longest Common Substring: " + longestCommonSubstringDP(str3, str4));
    }
}
