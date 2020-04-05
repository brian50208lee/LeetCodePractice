package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P3_LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testLengthOfLongestSubstring() {
        // given
        P3_LongestSubstringWithoutRepeatingCharacters p3 = new P3_LongestSubstringWithoutRepeatingCharacters();
        
        //when
        
        //then
        Assert.assertEquals(3, p3.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, p3.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, p3.lengthOfLongestSubstring("pwwkew"));
    }
}