import java.util.Arrays;

public class SegmentTreeRangeSum {
    private static class SegmentTree {
        private final int[] tree;
        private final int n;

        SegmentTree(int[] data) {
            this.n = data.length;
            this.tree = new int[4 * n];
            build(data, 1, 0, n - 1);
        }

        private void build(int[] data, int node, int left, int right) {
            if (left == right) {
                tree[node] = data[left];
                return;
            }

            int mid = left + (right - left) / 2;
            build(data, node * 2, left, mid);
            build(data, node * 2 + 1, mid + 1, right);
            tree[node] = tree[node * 2] + tree[node * 2 + 1];
        }

        int query(int ql, int qr) {
            return query(1, 0, n - 1, ql, qr);
        }

        private int query(int node, int left, int right, int ql, int qr) {
            if (qr < left || right < ql) {
                return 0;
            }
            if (ql <= left && right <= qr) {
                return tree[node];
            }
            int mid = left + (right - left) / 2;
            return query(node * 2, left, mid, ql, qr)
                + query(node * 2 + 1, mid + 1, right, ql, qr);
        }

        void update(int index, int value) {
            update(1, 0, n - 1, index, value);
        }

        private void update(int node, int left, int right, int index, int value) {
            if (left == right) {
                tree[node] = value;
                return;
            }

            int mid = left + (right - left) / 2;
            if (index <= mid) {
                update(node * 2, left, mid, index, value);
            } else {
                update(node * 2 + 1, mid + 1, right, index, value);
            }
            tree[node] = tree[node * 2] + tree[node * 2 + 1];
        }
    }

    public static void main(String[] args) {
        int[] values = {2, 1, 5, 3, 4, 7, 9, 6};
        SegmentTree tree = new SegmentTree(values);

        System.out.println("Array: " + Arrays.toString(values));
        System.out.println("Sum [2, 5]: " + tree.query(2, 5));

        tree.update(3, 10);
        values[3] = 10;
        System.out.println("After update index 3 -> 10");
        System.out.println("Array: " + Arrays.toString(values));
        System.out.println("Sum [2, 5]: " + tree.query(2, 5));
    }
}
