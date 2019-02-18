package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P62_UniquePathsTest {
    @Test
    public void testUniquePathsDP() {
        // given
        P62_UniquePaths p62 = new P62_UniquePaths();

        //when

        //then
        Assert.assertEquals(3, p62.uniquePaths(3,2));
        Assert.assertEquals(28, p62.uniquePaths(7,3));
        Assert.assertEquals(1916797311, p62.uniquePaths(51,9));
    }
}