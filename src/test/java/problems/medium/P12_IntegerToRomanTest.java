package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P12_IntegerToRomanTest {

    @Test
    public void testIntToRoman() {
        // given
        P12_IntegerToRoman integerToRomanSolver = new P12_IntegerToRoman();

        //when

        //then
        Assert.assertEquals("III", integerToRomanSolver.intToRoman(3));
        Assert.assertEquals("IV", integerToRomanSolver.intToRoman(4));
        Assert.assertEquals("IX", integerToRomanSolver.intToRoman(9));
        Assert.assertEquals("LVIII", integerToRomanSolver.intToRoman(58));
        Assert.assertEquals("MCMXCIV", integerToRomanSolver.intToRoman(1994));
    }
}