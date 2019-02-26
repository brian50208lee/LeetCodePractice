package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P387_FirstUniquecharacterInAStringTest {
    @Test
    public void testFirstUniqChar() {
        P387_FirstUniquecharacterInAString p387 = new P387_FirstUniquecharacterInAString();
        Assert.assertEquals(0, p387.firstUniqChar("leetcode"));
    }

    @Test
    public void testFirstUniqChar2() {
        P387_FirstUniquecharacterInAString p387 = new P387_FirstUniquecharacterInAString();
        Assert.assertEquals(2, p387.firstUniqChar("loveleetcode"));
    }
}