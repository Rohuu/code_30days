public class PatternStaircase {
    public static void main(String[] args) {
        showPattern(10);
    }

    static void showPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
