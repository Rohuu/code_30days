public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -85, -56, -9, 0, 1, 5, 6, 8, 9, 78, 780, 999, 2589 };
        // int target = 78;
        int ans = searchFun(arr, 2589);
        System.out.println(ans);
    }

    static int searchFun(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
