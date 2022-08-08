import java.util.Arrays;

public class StringsAnagram {
    public static void main(String[] args) {
        boolean ans = isAnagram("rohit", "tihor");
        System.out.println(ans);
    }

    static boolean isAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1, 0, ch1.length);
        Arrays.sort(ch2, 0, ch2.length);

        if (Arrays.equals(ch1, ch2)) {
            return true;
        }
        return false;
    }
}
