package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P166_FractionToRecurringDecimalTest {
    @Test
    public void testFractionToDecimal() {
        P166_FractionToRecurringDecimal p166 = new P166_FractionToRecurringDecimal();
        Assert.assertEquals("0.5", p166.fractionToDecimal(1,2));
    }

    @Test
    public void testFractionToDecimal2() {
        P166_FractionToRecurringDecimal p166 = new P166_FractionToRecurringDecimal();
        Assert.assertEquals("2", p166.fractionToDecimal(2,1));
    }

    @Test
    public void testFractionToDecimal3() {
        P166_FractionToRecurringDecimal p166 = new P166_FractionToRecurringDecimal();
        Assert.assertEquals("0.(6)", p166.fractionToDecimal(2,3));
    }

    @Test
    public void testFractionToDecimal4() {
        P166_FractionToRecurringDecimal p166 = new P166_FractionToRecurringDecimal();
        Assert.assertEquals("0", p166.fractionToDecimal(0,-5));
    }


    @Test
    public void testFractionToDecimal5() {
        P166_FractionToRecurringDecimal p166 = new P166_FractionToRecurringDecimal();
        Assert.assertEquals("-6.25", p166.fractionToDecimal(-50,8));
    }
}