public class PeakInRotatedRepeatingArray {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 2, 2, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2 };
        // int[] arr = { 17, 21, 91, 1, 2, 2, 3, 3, 5, 6, 8, 9, 10, 11, 13, 13, 15 };
        int ans = searchPeakIndex(arr);
        System.out.println("peak element has index: " + ans);
    }

    static int searchPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            } else if (arr[mid] <= arr[mid + 1]) {
                if (arr[start] <= arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
