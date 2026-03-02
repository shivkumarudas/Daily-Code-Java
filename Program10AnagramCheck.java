import java.util.Arrays;
import java.util.Scanner;

public class Program10AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String b = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.equals(first, second) ? "Anagram" : "Not Anagram");
    }
}
