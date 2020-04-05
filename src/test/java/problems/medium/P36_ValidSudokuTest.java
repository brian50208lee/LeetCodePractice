package problems.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P36_ValidSudokuTest {
    private P36_ValidSudoku p36;

    @Before
    public void setUp() throws Exception {
        p36 = new P36_ValidSudoku();
    }

    @Test
    public void test1() {
        // given
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        //when

        //then
        Assert.assertEquals(true, p36.isValidSudoku(board));
    }

    @Test
    public void test2() {
        // given
        char[][] board = new char[][]{
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        //when

        //then
        Assert.assertEquals(false, p36.isValidSudoku(board));
    }


}