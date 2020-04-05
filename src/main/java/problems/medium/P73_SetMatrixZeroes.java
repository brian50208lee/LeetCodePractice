package problems.medium;

public class P73_SetMatrixZeroes {
    private boolean firstRowZero = false;
    private boolean firstColZero = false;

    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        checkFirstRowColZero(matrix);
        setZeroAtFirstRowAndColumn(matrix);
        setRowZero(matrix);
        setColZero(matrix);
        setFirstRowColZero(matrix);
    }

    private void checkFirstRowColZero(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            if (matrix[r][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        for (int c = 0; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                firstRowZero = true;
                break;
            }
        }
    }

    /**
     * check matrix[1][1] to matrix[n-1][m-1]
     * set 0 to first row/column if any 0 exists
     */
    private void setZeroAtFirstRowAndColumn(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
    }

    private void setRowZero(int[][] matrix) {
        for (int c = 1; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 0; r < matrix.length; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
    }

    private void setColZero(int[][] matrix) {
        for (int r = 1; r < matrix.length; r++) {
            if (matrix[r][0] == 0) {
                for (int c = 0; c < matrix[0].length; c++) {
                    matrix[r][c] = 0;
                }
            }
        }
    }

    private void setFirstRowColZero(int[][] matrix) {
        if (firstColZero) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][0] = 0;
            }
        }
        if (firstRowZero) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[0][c] = 0;
            }
        }
    }
}
