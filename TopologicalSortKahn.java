import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TopologicalSortKahn {
    public static List<Integer> topologicalSort(int nodes, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[nodes];
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(to);
            indegree[to]++;
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nodes; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            order.add(current);

            for (int next : graph.get(current)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        if (order.size() != nodes) {
            throw new IllegalStateException("Graph contains a cycle; topological order does not exist.");
        }
        return order;
    }

    public static void main(String[] args) {
        int nodes = 6;
        int[][] edges = {
            {5, 2},
            {5, 0},
            {4, 0},
            {4, 1},
            {2, 3},
            {3, 1}
        };

        List<Integer> order = topologicalSort(nodes, edges);
        System.out.println("Topological order: " + order);
    }
}
