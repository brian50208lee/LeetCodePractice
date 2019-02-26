package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P240_Search2DMatrixIITest {
    @Test
    public void testSearch() {
        // given
        P240_Search2DMatrixII p240 = new P240_Search2DMatrixII();
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        boolean expected = true;

        //when

        //then
        Assert.assertEquals(expected, p240.searchMatrix(matrix, target));
    }

    @Test
    public void testSearch2() {
        // given
        P240_Search2DMatrixII p240 = new P240_Search2DMatrixII();
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;
        boolean expected = false;

        //when

        //then
        Assert.assertEquals(expected, p240.searchMatrix(matrix, target));
    }
}