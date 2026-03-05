class Program19BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 8;
        int left = 0;
        int right = arr.length - 1;
        int position = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                position = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (position != -1) {
            System.out.println("Found at index " + position);
        } else {
            System.out.println("Not found");
        }
    }
}
