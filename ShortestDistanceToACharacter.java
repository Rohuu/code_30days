
// Qus: https://leetcode.com/problems/shortest-distance-to-a-character/
import java.util.ArrayList;
import java.util.Arrays;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("abaa", 'b')));
    }

    static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        ArrayList<Integer> occuranceOfC = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                occuranceOfC.add(i);
            }
        }

        for (int i = 0; i < ans.length; i++) {
            int min = 2147483647;
            for (int j = 0; j < occuranceOfC.size(); j++) {
                if (Math.abs(i - occuranceOfC.get(j)) < min) {
                    min = Math.abs(i - occuranceOfC.get(j));
                }
            }
            ans[i] = min;
        }
        return ans;
    }
}
