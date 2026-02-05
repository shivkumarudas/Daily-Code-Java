import java.util.Stack;

public class pro_validparentheses {
    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c=='('||c=='{'||c=='[')
                st.push(c);
            else {
                if (st.isEmpty()) { System.out.println("Invalid"); return; }
                char t = st.pop();
                if ((c==')'&&t!='(')||(c=='}'&&t!='{')||(c==']'&&t!='[')) {
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        System.out.println(st.isEmpty() ? "Valid" : "Invalid");
    }
}
