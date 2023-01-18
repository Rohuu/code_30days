import java.util.HashMap;
import java.util.Map;

public class FindCommonElements {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 4, 5, 6, 7, 8, 9, 10 };
        getDuplicatesElements(arr1, arr2);
    }

    static void getDuplicatesElements(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (map.containsKey(arr2[j])) {
                map.put(arr2[j], map.get(arr2[j]) + 1);
            } else {
                map.put(arr2[j], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) != 1)
                System.out.print(key + " ");
        }
        // System.out.println(map);
    }
}
