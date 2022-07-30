import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array length");
        int num = sc.nextInt();

        System.out.println("enter array");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = printSubArray(arr);
        System.out.println("maximum subarray sum is " + ans);
    }

    /**
     * @param arr
     */
    static int printSubArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
