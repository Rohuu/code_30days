public class FloorValue {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int ans = getFloorValue(arr, 4);
        if (ans == -1) {
            System.out.println("Target is out of array");
        } else {
            System.out.println(ans);
        }
    }

    static int getFloorValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if (target < arr[0]) {
            return -1;
        }
        if (target > arr[arr.length - 1]) {
            return arr[arr.length - 1];
        }
        while (start <= end) {
            mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}