package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P48_RotateImageTest {

    @Test
    public void testRotateImage() {
        // given
        P48_RotateImage p48 = new P48_RotateImage();
        int[][] matrix = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] expected = new int[][] {
                {7,4,1},
                {8,5,2},
                {9,6,3}
        };

        //when
        p48.rotate(matrix);

        //then
        Assert.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(matrix));
    }

    @Test
    public void testRotateImage2() {
        // given
        P48_RotateImage p48 = new P48_RotateImage();
        int[][] matrix = new int[][] {
                { 5, 1, 9,11},
                { 2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        int[][] expected = new int[][] {
                {15,13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7,10,11}
        };

        //when
        p48.rotate(matrix);

        //then
        Assert.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(matrix));
    }

}