// Qus: https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValidString("[{()}]{}()[]({[]})"));
    }

    static boolean isValidString(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();

        // if odd numbers in array, then it is invalid paranthesis.
        // if (ch.length % 2 != 0) {
        // return false;
        // }
        // if closing in very starting.... invalid paranthesis
        // if (ch[0] == ']' || ch[0] == ')' || ch[0] == '}') {
        // return false;
        // }
        // or opening at last.... invalid paranthesis
        // if (ch[ch.length - 1] == '[' || ch[ch.length - 1] == '(' || ch[ch.length - 1]
        // == '{') {
        // return false;
        // }

        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '[' || ch[i] == '{' || ch[i] == '(') {
                st.push(ch[i]);
            } else if (ch[i] == ']') {
                if (st.empty()) {
                    return false;
                } else if (st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            }

            else if (ch[i] == '}') {
                if (st.empty()) {
                    return false;
                } else if (st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            }

            else if (ch[i] == ')') {
                if (st.empty()) {
                    return false;
                } else if (st.peek() != '(') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        if (st.size() == 0) {
            return true;
        }
        return false;
    }
}
