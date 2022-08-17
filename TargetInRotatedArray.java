// first find peak element
// two sorted arrays to the left and right of the peak
// binary search in both side

public class TargetInRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 10, 11, 12, 13, 156, 896, 7869, 44444, 55555, 0, 1, 2, 3, 4, 5, 6 };
        int target = 0;
        int ans1 = binarySearchFirst(arr, target);
        int ans2 = binarySearchSecond(arr, target);
        if (ans1 == -1) {
            System.out.println("peak element has index " + ans2);
        } else {
            System.out.println("peak element has index " + ans1);
        }
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

    static int binarySearchFirst(int[] arr, int target) {
        int peakIndex = searchPeakIndex(arr);
        int start = 0;
        int end = peakIndex;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearchSecond(int[] arr, int target) {
        int peakIndex = searchPeakIndex(arr);
        int start = peakIndex + 1;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}