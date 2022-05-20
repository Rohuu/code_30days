package code_30days;

import java.io.*;

public class TimeConversion {
    public static String timeConversion(String s) {
        char[] ch = s.toCharArray();
        if (ch[8] == 'A') {
            if (ch[0] == '1' && ch[1] == '2') {
                ch[0] = '0';
                ch[1] = '0';
            }
        }
        if (ch[8] == 'P') {
            if (ch[0] == '1' && ch[1] == '2') {
                ch[0] = '1';
                ch[1] = '2';
            } else if (ch[0] == '0' && ch[1] == '8') {
                ch[0] = '2';
                ch[1] = '0';
            } else if (ch[0] == '0' && ch[1] == '9') {
                ch[0] = '2';
                ch[1] = '1';
            } else {
                ch[0] = (char) (ch[0] + 1);
                ch[1] = (char) (ch[1] + 2);
            }
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < ch.length - 2; i++) {
            out.append(ch[i]);
        }
        return out.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = TimeConversion.timeConversion(s);

        bufferedReader.close();
        System.out.println(result);
    }
}
