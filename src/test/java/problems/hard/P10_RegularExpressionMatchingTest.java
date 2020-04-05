package problems.hard;

import org.junit.Assert;
import org.junit.Test;

public class P10_RegularExpressionMatchingTest {
    @Test
    public void testIsMatch() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(false, p10.isMatch("aa", "a"));
    }

    @Test
    public void testIsMatch2() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(true, p10.isMatch("aa", "a*"));
    }

    @Test
    public void testIsMatch3() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(true, p10.isMatch("ab", ".*"));
    }

    @Test
    public void testIsMatch4() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(true, p10.isMatch("aab", "c*a*b"));
    }

    @Test
    public void testIsMatch5() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(false, p10.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    public void testIsMatch6() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(true, p10.isMatch("mississippi", "mis*is*ip*."));
    }


    @Test
    public void testIsMatchRecursive() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(false, p10.isMatchRecursive("aa", "a"));
    }

    @Test
    public void testIsMatchRecursive2() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(true, p10.isMatchRecursive("aa", "a*"));
    }

    @Test
    public void testIsMatchRecursive3() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(true, p10.isMatchRecursive("ab", ".*"));
    }

    @Test
    public void testIsMatchRecursive4() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(true, p10.isMatchRecursive("aab", "c*a*b"));
    }

    @Test
    public void testIsMatchRecursive5() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(false, p10.isMatchRecursive("mississippi", "mis*is*p*."));
    }

    @Test
    public void testIsMatchRecursive6() {
        P10_RegularExpressionMatching p10 = new P10_RegularExpressionMatching();
        Assert.assertEquals(true, p10.isMatchRecursive("mississippi", "mis*is*ip*."));
    }
}