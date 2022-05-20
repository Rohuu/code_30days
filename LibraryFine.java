package code_30days;
import java.util.*;
import java.io.*;

public class LibraryFine {
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if (m1 == m2 && y1 == y2) {
            if (d1 == d2) {
                fine = 0;
            }
            if (d1 < d2) {
                fine = 0;
            }
            if (d1 > d2) {
                fine = 15 * (d1 - d2);
            }
        }
        if (m1 > m2 && y1 == y2) {
            fine = 500 * (m1 - m2);
        }
        if (m1 < m2 && y1 == y2) {
            fine = 0;
        }
        if (y1 > y2) {
            fine = 10000;
        }
        if (y1 < y2) {
            fine = 0;
        }
        return fine;
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int d1 = Integer.parseInt(firstMultipleInput[0]);

            int m1 = Integer.parseInt(firstMultipleInput[1]);

            int y1 = Integer.parseInt(firstMultipleInput[2]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int d2 = Integer.parseInt(secondMultipleInput[0]);

            int m2 = Integer.parseInt(secondMultipleInput[1]);

            int y2 = Integer.parseInt(secondMultipleInput[2]);

            int result = LibraryFine.libraryFine(d1, m1, y1, d2, m2, y2);

            bufferedReader.close();
            System.out.println(result);
        }
    }
}