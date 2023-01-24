// Qus: https://www.codingninjas.com/codestudio/problems/set-matrix-zeros_3846774?
//      topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 2, 3 },
                { 1, 0, 3 },
                { 1, 2, 0 } };
        setRowAndColumnZero(matrix);
    }

    static void setRowAndColumnZero(int[][] matrix) {
        int tempRowIndex = 0;
        int tempColIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    tempRowIndex = i;
                    tempColIndex = j;

                    for (int row = 0; row < matrix.length; row++) {
                        for (int col = 0; col < matrix[row].length; col++) {
                            if (row == tempRowIndex || col == tempColIndex) {
                                if (matrix[row][col] != 0) {
                                    matrix[row][col] = -1;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == -1) {
                    matrix[row][col] = 0;
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}