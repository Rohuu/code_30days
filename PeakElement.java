public class PeakElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 9, 11, 12, 13, 15, 17, 19, 22, 25, 28, 35, 39, 45, 89, 112, 145, 189, 205, 509, 10,
                9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int ans = peakElementInBitonicArray(arr);
        System.out.println(ans);
    }

    static int peakElementInBitonicArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                if (arr[mid] > arr[mid - 1]) {
                    return arr[mid];
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
