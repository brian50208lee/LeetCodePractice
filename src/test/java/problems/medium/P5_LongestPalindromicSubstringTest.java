package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P5_LongestPalindromicSubstringTest {
    @Test
    public void testLongestPalindrome() {
        // given
        P5_LongestPalindromicSubstring p5 = new P5_LongestPalindromicSubstring();

        //when

        //then
        Assert.assertEquals("bab", p5.longestPalindrome("babad"));
        Assert.assertEquals("bb", p5.longestPalindrome("cbbd"));
    }
}