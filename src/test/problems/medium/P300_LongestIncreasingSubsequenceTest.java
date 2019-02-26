package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P300_LongestIncreasingSubsequenceTest {
    @Test
    public void testLengthOfLIS() {
        P300_LongestIncreasingSubsequence p300 = new P300_LongestIncreasingSubsequence();
        Assert.assertEquals(4, p300.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}