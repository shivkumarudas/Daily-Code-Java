import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicStringsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println("Not isomorphic");
            sc.close();
            return;
        }

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapST.containsKey(a) && mapST.get(a) != b) {
                System.out.println("Not isomorphic");
                sc.close();
                return;
            }
            if (mapTS.containsKey(b) && mapTS.get(b) != a) {
                System.out.println("Not isomorphic");
                sc.close();
                return;
            }

            mapST.put(a, b);
            mapTS.put(b, a);
        }

        System.out.println("Isomorphic");
        sc.close();
    }
}
