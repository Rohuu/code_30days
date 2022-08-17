// qus : https://www.hackerrank.com/contests/mountblue-technologies/challenges/hackerrank-in-a-string

public class HackerrankInAString {
    public static void main(String[] args) {
        String s = "hhaacckkekraraannk";
        // String s = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        String ans = findInString(s);
        System.out.println(ans);
    }

    static String findInString(String s) {
        char[] ch = { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };

        if (s.length() < ch.length) {
            return "NO";
        }

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch[j]) {
                j++;
                if (j == 10) {
                    break;
                }
            }
            if (i == s.length() - 1 && j < 9) {
                return "NO";
            }
        }
        return "YES";
    }
}
