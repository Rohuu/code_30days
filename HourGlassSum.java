// Qus: https://www.hackerrank.com/challenges/2d-array/problem

public class HourGlassSum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
        int ans = maxHourGlassSum(arr);
        System.out.println(ans);
    }

    static int maxHourGlassSum(int[][] arr) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];

                if (sum >= maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
