import java.util.HashSet;
import java.util.Set;

public class RemoveRepetationOfElements {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 3, 2, 1, 102, 152, 164 };
        int[] arr2 = { 5, 6, 4, 5, 6, 7, 1, 10, 15, 14, 16 };
        getUniqueElementsFromTwoArrays(arr1, arr2);
    }

    static void getUniqueElementsFromTwoArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
}
