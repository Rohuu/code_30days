public class ElementSearchInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 9, 56, 89, 781, 2589, 9875, 11111, 22222, 33333, 55555, 77777, 99999, 111111, 222222,
                333333, 444444, 555555, 666666, 777777, 888888, 999999 };
        int ans = getElement(arr, 55555);
        System.out.println(ans);
    }

    static int getElement(int[] arr, int target) {
        int i = 0;
        int start;
        int end;
        int mid = 0;
        boolean condition = (target >= arr[i] && target <= arr[i + 10]);
        while (condition == false) {
            i += 10;
        }
        start = i;
        end = i + 10;

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
