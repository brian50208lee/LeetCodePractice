package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P8_StringToIntegerTest {

    @Test
    public void testMyAtoi() {
        // given
        P8_StringToInteger p8 = new P8_StringToInteger();

        //when

        //then
        Assert.assertEquals(42, p8.myAtoi("42"));
        Assert.assertEquals(-42, p8.myAtoi("-42"));
        Assert.assertEquals(4193, p8.myAtoi("4193 with words"));
        Assert.assertEquals(0, p8.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, p8.myAtoi("-91283472332"));
        Assert.assertEquals(0, p8.myAtoi("+"));
    }

}