public class PeakInRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int ans = peak(arr);
        System.out.println(ans);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid - 1] > arr[mid]) {
                return arr[mid - 1];
            }
            if (arr[mid] < arr[mid + 1]) {
                if (arr[start] < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
