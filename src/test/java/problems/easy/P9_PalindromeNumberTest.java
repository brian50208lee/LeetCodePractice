package problems.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P9_PalindromeNumberTest {


    @Test
    public void testIsPalindrome() {
        // given
        P9_PalindromeNumber palindromeNumberSolver = new P9_PalindromeNumber();

        //when

        //then
        Assert.assertEquals(true, palindromeNumberSolver.isPalindrome(121));
        Assert.assertEquals(false, palindromeNumberSolver.isPalindrome(-121));
        Assert.assertEquals(false, palindromeNumberSolver.isPalindrome(10));
    }
}