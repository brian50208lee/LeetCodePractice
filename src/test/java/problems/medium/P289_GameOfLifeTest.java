package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P289_GameOfLifeTest {
    @Test
    public void testGameOfLife() {
        // given
        P289_GameOfLife p289 = new P289_GameOfLife();
        int[][] board = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };
        int[][] expected = {
                {0,0,0},
                {1,0,1},
                {0,1,1},
                {0,1,0}
        };

        //when
        p289.gameOfLife(board);

        //then
        Assert.assertArrayEquals(expected, board);
    }
}