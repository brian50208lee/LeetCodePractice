package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P14_LongestCommonPrefixTest {
    @Test
    public void testLongestCommonPrefix() {
        // given
        P14_LongestCommonPrefix longestCommonPrefixSolver = new P14_LongestCommonPrefix();
        //when

        //then
        Assert.assertEquals("fl", longestCommonPrefixSolver.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", longestCommonPrefixSolver.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        Assert.assertEquals("", longestCommonPrefixSolver.longestCommonPrefix(new String[]{"dog", "racecar", ""}));
        Assert.assertEquals("", longestCommonPrefixSolver.longestCommonPrefix(new String[]{}));
    }
}