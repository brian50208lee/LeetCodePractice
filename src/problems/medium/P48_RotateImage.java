package problems.medium;

public class P48_RotateImage {
    public void rotate(int[][] matrix) {
        flipDiagnalRighTop(matrix);
        flipVertical(matrix);
    }

    public void flipVertical(int[][] matrix){
        int maxRowIndex = matrix.length - 1;
        for (int i = 0; i < matrix.length / 2 ; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[maxRowIndex - i];
            matrix[maxRowIndex - i] = tmp;
        }
    }

    public void flipDiagnalRighTop(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    swap(matrix, i, j, n - j - 1, n - i - 1);
                }
            }
        }
    }

    private void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        int tmp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = tmp;
    }
}