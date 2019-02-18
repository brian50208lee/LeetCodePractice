package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P79_WordSearchTest {
    @Test
    public void testExist() {
        // given
        P79_WordSearch p79 = new P79_WordSearch();
        char[][] board = new char[][] {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };

        //when

        //then
        Assert.assertEquals(true, p79.exist(board, "ABCCED"));
        Assert.assertEquals(true, p79.exist(board, "SEE"));
        Assert.assertEquals(false, p79.exist(board, "ABCB"));

    }
}