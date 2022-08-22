public class PatternBottomNumbers {
    public static void main(String[] args) {
        showPattern(5);
    }

    static void showPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}