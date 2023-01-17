// Qus: https://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/

import java.util.HashMap;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        String str = "abbbbbaaaa";
        findMaximumOccuringCharacter(str);
    }

    static void findMaximumOccuringCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        char maxFreqChar = str.charAt(0);
        int count = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > map.get(maxFreqChar)) {
                maxFreqChar = key;
            } else if (map.get(key) == map.get(maxFreqChar)) {
                count++;
            }

        }
        if (str.length() == 1) {
            System.out.println("Character " + str.charAt(0) + " has maximum frequency of 1");
            return;
        }
        if (count == str.length()) {
            System.out.println("All characters are of same frequency 1");
            return;
        }
        System.out.println(
                "Character '" + maxFreqChar + "' has maximum frequency in the string which is "
                        + map.get(maxFreqChar));
    }
}
