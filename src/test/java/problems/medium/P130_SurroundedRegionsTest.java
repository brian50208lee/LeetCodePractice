package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P130_SurroundedRegionsTest {
    @Test
    public void testSolve() {
        // given
        P130_SurroundedRegions p130 = new P130_SurroundedRegions();
        char[][] board = new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        char[][] expected = new char[][]{
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','O','X','X'}
        };

        //when
        p130.solve(board);

        //then
        Assert.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(board));
    }

    @Test
    public void testSolve2() {
        // given
        P130_SurroundedRegions p130 = new P130_SurroundedRegions();
        char[][] board = new char[][]{
                {'O','O','O','O','X','X'},
                {'O','O','O','O','O','O'},
                {'O','X','O','X','O','O'},
                {'O','X','O','O','X','O'},
                {'O','X','O','X','O','O'},
                {'O','X','O','O','O','O'}
        };
        char[][] expected = new char[][]{
                {'O','O','O','O','X','X'},
                {'O','O','O','O','O','O'},
                {'O','X','O','X','O','O'},
                {'O','X','O','O','X','O'},
                {'O','X','O','X','O','O'},
                {'O','X','O','O','O','O'}
        };

        //when
        p130.solve(board);

        //then
        Assert.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(board));
    }
}