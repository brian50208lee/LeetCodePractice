package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P125_ValidPalindromeTest {
    @Test
    public void testIsPalindrome() {
        P125_ValidPalindrome p125 = new P125_ValidPalindrome();
        Assert.assertEquals(true, p125.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testIsPalindrome2() {
        P125_ValidPalindrome p125 = new P125_ValidPalindrome();
        Assert.assertEquals(false, p125.isPalindrome("race a car"));
    }
}