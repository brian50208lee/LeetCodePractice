package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P139_WordBreakTest {
    @Test
    public void testWordBreak() {
        P139_WordBreak p139 = new P139_WordBreak();
        Assert.assertEquals(true, p139.wordBreak("leetcode", Arrays.asList("leet", "code")));
    }

    @Test
    public void testWordBreak2() {
        P139_WordBreak p139 = new P139_WordBreak();
        Assert.assertEquals(true, p139.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }

    @Test
    public void testWordBreak3() {
        P139_WordBreak p139 = new P139_WordBreak();
        Assert.assertEquals(false, p139.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    public void testWordBreakBacktrack() {
        P139_WordBreak p139 = new P139_WordBreak();
        Assert.assertEquals(true, p139.wordBreakBackTrack("leetcode", Arrays.asList("leet", "code")));
    }

    @Test
    public void testWordBreakBacktrack2() {
        P139_WordBreak p139 = new P139_WordBreak();
        Assert.assertEquals(true, p139.wordBreakBackTrack("applepenapple", Arrays.asList("apple", "pen")));
    }

    @Test
    public void testWordBreakBacktrack3() {
        P139_WordBreak p139 = new P139_WordBreak();
        Assert.assertEquals(false, p139.wordBreakBackTrack("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}