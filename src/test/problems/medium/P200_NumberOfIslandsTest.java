package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P200_NumberOfIslandsTest {
    @Test
    public void testIslands() {
        P200_NumberOfIslands p200 = new P200_NumberOfIslands();
        char[][] grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int expected = 1;
        Assert.assertEquals(expected, p200.numIslands(grid));
    }

    @Test
    public void testIslands2() {
        P200_NumberOfIslands p200 = new P200_NumberOfIslands();
        char[][] grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        int expected = 3;
        Assert.assertEquals(expected, p200.numIslands(grid));
    }
}