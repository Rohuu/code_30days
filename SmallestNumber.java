//  Qus : https://leetcode.com/problems/find-smallest-letter-greater-than-target/



public class SmallestNumber {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'i' };
        char ans = nextGreatestLetter(letters, 'f');
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start == letters.length) {
            return letters[0];
        }
        return letters[start];
    }
}
