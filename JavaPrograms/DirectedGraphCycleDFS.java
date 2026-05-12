import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectedGraphCycleDFS {
    public static boolean hasCycle(int node, List<List<Integer>> graph, int[] state) {
        state[node] = 1;
        for (int next : graph.get(node)) {
            if (state[next] == 1) {
                return true;
            }
            if (state[next] == 0 && hasCycle(next, graph, state)) {
                return true;
            }
        }
        state[node] = 2;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter directed edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(w);
        }

        int[] state = new int[v];
        for (int i = 0; i < v; i++) {
            if (state[i] == 0 && hasCycle(i, graph, state)) {
                System.out.println("Cycle detected");
                sc.close();
                return;
            }
        }

        System.out.println("No cycle");
        sc.close();
    }
}
