package problems.medium;

import java.util.ArrayList;
import java.util.List;

public class P54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        List<Integer> results = new ArrayList<>();

        int minR = 0;
        int maxR = matrix.length - 1;
        int minC = 0;
        int maxC = matrix[0].length - 1;

        while (minR <= maxR && minC <= maxC) {
            for (int c = minC; c <= maxC && minR <= maxR; c++) {
                results.add(matrix[minR][c]);
            }
            minR++;
            for (int r = minR; r <= maxR && minC <= maxC; r++) {
                results.add(matrix[r][maxC]);
            }
            maxC--;
            for (int c = maxC; c >= minC && minR <= maxR; c--) {
                results.add(matrix[maxR][c]);
            }
            maxR--;
            for (int r = maxR; r >= minR && minC <= maxC; r--) {
                results.add(matrix[r][minC]);
            }
            minC++;
        }

        return results;
    }
}
