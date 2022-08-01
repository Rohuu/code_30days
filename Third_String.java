package code_30days;

import java.util.*;
public class Third_String {
    public static void main(String[] args) {
        String ans = newString("SON", "FATHER");
        System.out.println(ans);
    }

    static String newString(String s1, String s2) {
        int i = 0, j = 0, k = 0;
        char[] ch = new char[s1.length() + s2.length()];
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) > s2.charAt(j)) {
                ch[k] = s2.charAt(j);
                k++;
                j++;
            } else if (s1.charAt(i) < s2.charAt(j)) {
                ch[k] = s1.charAt(i);
                k++;
                i++;
            } else {
                ch[k] = s1.charAt(i);
                i++;
                k++;
            }
        }

        while (ch[s1.length() + s2.length() - 1] == 0) {
            if (i >= s1.length() && k != s1.length() + s2.length()) {
                ch[k] = s2.charAt(j);
                k++;
                j++;
            }
            if (j >= s2.length() && k != s1.length() + s2.length()) {
                ch[k] = s1.charAt(i);
                k++;
                i++;
            }
        }

        StringBuilder newStr = new StringBuilder();
        for (int p = 0; p < ch.length; p++) {
            newStr.append(ch[p]);
        }
        return newStr.toString();
    }
}
