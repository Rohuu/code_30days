public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        int ans = getMinimumNumber(9009);
        System.out.println(ans);
    }

    static int getMinimumNumber(int n) {
        int newNum = 0;
        int unitDigit = 0;
        while (n > 0) {
            unitDigit = n % 10;
            if (unitDigit >= 5) {
                unitDigit = 9 - unitDigit;
            }
            n = n / 10;
            newNum = newNum * 10 + unitDigit;
        }
        int rem = 0;
        int revNum = 0;
        while (newNum > 0) {
            rem = newNum % 10;
            newNum = newNum / 10;
            revNum = revNum * 10 + rem;
        }
        return revNum;
    }
}
