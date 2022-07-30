public class BishopPath {
    public static void main(String[] args) {
        bishopMoves(8, 6, 6);
    }

    static void bishopMoves(int n, int i, int j) {
        int x = i;
        int y = j;
        if (i >= n && j >= n) {
            System.out.println("Bishop's position is out of board");
        } else {
            while (i > 0 && j > 0) {
                i = i - 1;
                j = j - 1;
                System.out.println("[" + i + "]" + "[" + j + "]");
            }

            i = x;
            j = y;
            while (i > 0 && j < n - 1) {
                i = i - 1;
                j = j + 1;
                System.out.println("[" + i + "]" + "[" + j + "]");
            }

            i = x;
            j = y;
            while (i < n - 1 && j > 0) {
                i = i + 1;
                j = j - 1;
                System.out.println("[" + i + "]" + "[" + j + "]");
            }

            i = x;
            j = y;
            while (i < n - 1 && j < n - 1) {
                i = i + 1;
                j = j + 1;
                System.out.println("[" + i + "]" + "[" + j + "]");
            }
        }
    }
}
