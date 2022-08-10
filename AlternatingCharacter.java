import java.util.Scanner;

public class AlternatingCharacter {
    public static void main(String[] args) {
        System.out.println("enter any string containing A and B only");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = deleteRepeatingLetters(s);
        System.out.println(ans);
    }

    static int deleteRepeatingLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
