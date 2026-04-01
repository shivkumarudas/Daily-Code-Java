public class UnionFindCycleDetection {
    private static class DSU {
        private final int[] parent;
        private final int[] rank;

        DSU(int size) {
            parent = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);

            if (rootA == rootB) {
                return false;
            }

            if (rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            } else if (rank[rootA] > rank[rootB]) {
                parent[rootB] = rootA;
            } else {
                parent[rootB] = rootA;
                rank[rootA]++;
            }
            return true;
        }
    }

    public static boolean hasCycle(int nodeCount, int[][] edges) {
        DSU dsu = new DSU(nodeCount);
        for (int[] edge : edges) {
            if (!dsu.union(edge[0], edge[1])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] graphWithCycle = {
            {0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 1}
        };

        int[][] graphWithoutCycle = {
            {0, 1}, {1, 2}, {2, 3}, {3, 4}
        };

        System.out.println("Graph 1 has cycle: " + hasCycle(5, graphWithCycle));
        System.out.println("Graph 2 has cycle: " + hasCycle(5, graphWithoutCycle));
    }
}
