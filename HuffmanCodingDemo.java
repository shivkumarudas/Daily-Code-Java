import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanCodingDemo {
    private static class Node {
        char ch;
        int freq;
        Node left;
        Node right;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        Node(int freq, Node left, Node right) {
            this.ch = '\0';
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        boolean isLeaf() {
            return left == null && right == null;
        }
    }

    private static Node buildTree(String text) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.freq));
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.offer(new Node(entry.getKey(), entry.getValue()));
        }

        if (pq.size() == 1) {
            pq.offer(new Node('\0', 0));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            pq.offer(new Node(left.freq + right.freq, left, right));
        }
        return pq.poll();
    }

    private static void buildCodes(Node node, String prefix, Map<Character, String> codes) {
        if (node == null) {
            return;
        }
        if (node.isLeaf()) {
            codes.put(node.ch, prefix.isEmpty() ? "0" : prefix);
            return;
        }
        buildCodes(node.left, prefix + '0', codes);
        buildCodes(node.right, prefix + '1', codes);
    }

    private static String encode(String text, Map<Character, String> codes) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            sb.append(codes.get(ch));
        }
        return sb.toString();
    }

    private static String decode(String bits, Node root) {
        StringBuilder decoded = new StringBuilder();
        Node current = root;

        for (char bit : bits.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;
            if (current.isLeaf()) {
                decoded.append(current.ch);
                current = root;
            }
        }
        return decoded.toString();
    }

    public static void main(String[] args) {
        String text = "huffman coding in java";
        Node root = buildTree(text);

        Map<Character, String> codes = new HashMap<>();
        buildCodes(root, "", codes);

        String encoded = encode(text, codes);
        String decoded = decode(encoded, root);

        System.out.println("Original text: " + text);
        System.out.println("Codes: " + codes);
        System.out.println("Encoded bits: " + encoded);
        System.out.println("Decoded text: " + decoded);
    }
}
