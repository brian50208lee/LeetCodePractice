package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P54_SpiralMatrixTest {
    @Test
    public void testSpiralOrder() {
        // given
        P54_SpiralMatrix p54 = new P54_SpiralMatrix();
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //when

        //then
        Assert.assertEquals(Arrays.asList(1,2,3,6,9,8,7,4,5), p54.spiralOrder(matrix));
    }

    @Test
    public void testSpiralOrder2() {
        // given
        P54_SpiralMatrix p54 = new P54_SpiralMatrix();
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };

        //when

        //then
        Assert.assertEquals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7), p54.spiralOrder(matrix));
    }
}