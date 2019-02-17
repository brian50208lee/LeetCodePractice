package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P73_SetMatrixZeroesTest {
    @Test
    public void testSetZeroes() {
        // given
        P73_SetMatrixZeroes p73 = new P73_SetMatrixZeroes();
        int[][] matrix = new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] expected = new int[][]{
                {1,0,1},
                {0,0,0},
                {1,0,1}
        };

        //when
        p73.setZeroes(matrix);

        //then
        Assert.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(matrix));
    }

    @Test
    public void testSetZeroes2() {
        // given
        P73_SetMatrixZeroes p73 = new P73_SetMatrixZeroes();
        int[][] matrix = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        int[][] expected = new int[][]{
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}
        };

        //when
        p73.setZeroes(matrix);

        //then
        Assert.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(matrix));
    }
}