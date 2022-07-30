import java.lang.reflect.Array;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array length");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        printSubArray(arr);
    }

    /**
     * @param arr
     */
    static void printSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
