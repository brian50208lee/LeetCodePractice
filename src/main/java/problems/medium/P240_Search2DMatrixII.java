package problems.medium;

public class P240_Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // start from top right corner
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) { // not out of bound
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) { // answer can not in this row
                row++;
            } else { // matrix[row][col] > target // answer can not in this col
                col--;
            }
        }
        return false;
    }
}
