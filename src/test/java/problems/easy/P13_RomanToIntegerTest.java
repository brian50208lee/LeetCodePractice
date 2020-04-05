package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P13_RomanToIntegerTest {
    @Test
    public void testRomanToInteger() {
        // given
        P13_RomanToInteger romanToIntegerSolver = new P13_RomanToInteger();
        //when

        //then
        Assert.assertEquals(3, romanToIntegerSolver.romanToInt("III"));
        Assert.assertEquals(4, romanToIntegerSolver.romanToInt("IV"));
        Assert.assertEquals(9, romanToIntegerSolver.romanToInt("IX"));
        Assert.assertEquals(58, romanToIntegerSolver.romanToInt("LVIII"));
        Assert.assertEquals(1994, romanToIntegerSolver.romanToInt("MCMXCIV"));
    }
}