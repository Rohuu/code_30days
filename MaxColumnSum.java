public class MaxColumnSum {
    public static void main(String[] args) {
        int[] arr = { 28, 31, 8, 5, 9, 7, 6, 2, 1, 17, 18, 21, 29, 61, 73, 97, 596, 654, 987, 356, 956, 758, 851, 853 };
        int ans = maxSumColumn(arr, 6);
        System.out.println(ans);
    }

    static int maxSumColumn(int[] arr, int divide) {
        int maxSum = 0;
        for (int i = 0; i <= arr.length / divide; i = i + 1) {
            int sum = 0;
            for (int j = i; j < arr.length; j = j + divide) {
                sum = sum + arr[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
