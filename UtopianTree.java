public class UtopianTree {
    public static void main(String[] args) {
        int ans = getHeight(5);
        System.out.println(ans);
    }

    static int getHeight(int n) {
        int treeHeight = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                treeHeight = treeHeight + 1;
            } else {
                treeHeight = treeHeight * 2;
            }
        }
        return treeHeight;
    }
}
