import java.util.HashMap;
import java.util.Map;

public class TrieWordDictionary {
    private static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean endOfWord;
    }

    private static class Trie {
        private final TrieNode root = new TrieNode();

        void insert(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                current.children.putIfAbsent(ch, new TrieNode());
                current = current.children.get(ch);
            }
            current.endOfWord = true;
        }

        boolean search(String word) {
            TrieNode node = traverse(word);
            return node != null && node.endOfWord;
        }

        boolean startsWith(String prefix) {
            return traverse(prefix) != null;
        }

        private TrieNode traverse(String value) {
            TrieNode current = root;
            for (char ch : value.toCharArray()) {
                current = current.children.get(ch);
                if (current == null) {
                    return null;
                }
            }
            return current;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apply");
        trie.insert("bat");
        trie.insert("batch");

        System.out.println("search(\"app\") = " + trie.search("app"));
        System.out.println("search(\"apps\") = " + trie.search("apps"));
        System.out.println("startsWith(\"appl\") = " + trie.startsWith("appl"));
        System.out.println("startsWith(\"cat\") = " + trie.startsWith("cat"));
    }
}
