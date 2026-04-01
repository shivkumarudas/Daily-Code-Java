import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraShortestPath {
    private static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    private static class State implements Comparable<State> {
        int node;
        int distance;

        State(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(State other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    private static int[] dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<State> pq = new PriorityQueue<>();
        pq.offer(new State(source, 0));

        while (!pq.isEmpty()) {
            State current = pq.poll();
            if (current.distance != dist[current.node]) {
                continue;
            }

            for (Edge edge : graph.get(current.node)) {
                int nextDist = current.distance + edge.weight;
                if (nextDist < dist[edge.to]) {
                    dist[edge.to] = nextDist;
                    pq.offer(new State(edge.to, nextDist));
                }
            }
        }
        return dist;
    }

    private static void addEdge(List<List<Edge>> graph, int from, int to, int weight) {
        graph.get(from).add(new Edge(to, weight));
        graph.get(to).add(new Edge(from, weight));
    }

    public static void main(String[] args) {
        int n = 6;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 2);
        addEdge(graph, 1, 2, 1);
        addEdge(graph, 1, 3, 5);
        addEdge(graph, 2, 3, 8);
        addEdge(graph, 2, 4, 10);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 3, 5, 6);
        addEdge(graph, 4, 5, 3);

        int source = 0;
        int[] distances = dijkstra(graph, source);

        System.out.println("Shortest distances from node " + source + ":");
        for (int i = 0; i < distances.length; i++) {
            String value = distances[i] == Integer.MAX_VALUE ? "INF" : String.valueOf(distances[i]);
            System.out.println("To node " + i + " -> " + value);
        }
    }
}
