package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P29_DivideTwoIntegersTest {
    @Test
    public void testDivide() {
        // given
        P29_DivideTwoIntegers p29 = new P29_DivideTwoIntegers();

        //when

        //then
        Assert.assertEquals(3, p29.divide(10, 3));
        Assert.assertEquals(-2, p29.divide(7, -3));
        Assert.assertEquals(-2, p29.divide(-7, 3));
        Assert.assertEquals(2, p29.divide(-7, -3));
        Assert.assertEquals(1, p29.divide(-2147483648, -2147483648));
    }
}