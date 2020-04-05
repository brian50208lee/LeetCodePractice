package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P395_LongestSubstringWithAtLeastKRepeatingCharactersTest {
    @Test
    public void testLongestSubstring() {
        P395_LongestSubstringWithAtLeastKRepeatingCharacters p395 = new P395_LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(3, p395.longestSubstring("aaabb", 3));
    }

    @Test
    public void testLongestSubstring2() {
        P395_LongestSubstringWithAtLeastKRepeatingCharacters p395 = new P395_LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(5, p395.longestSubstring("ababbc", 2));
    }

    @Test
    public void testLongestSubstring3() {
        P395_LongestSubstringWithAtLeastKRepeatingCharacters p395 = new P395_LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(3, p395.longestSubstring("bbaaacbd", 3));
    }
}