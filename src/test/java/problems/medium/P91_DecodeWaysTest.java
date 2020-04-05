package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P91_DecodeWaysTest {
    @Test
    public void testNumDecodings() {
        Assert.assertEquals(2, new P91_DecodeWays().numDecodings("12"));
    }

    @Test
    public void testNumDecodings2() {
        Assert.assertEquals(3, new P91_DecodeWays().numDecodings("226"));
    }

    @Test
    public void testNumDecodings3() {
        Assert.assertEquals(0, new P91_DecodeWays().numDecodings("0"));
    }

    @Test
    public void testNumDecodings4() {
        Assert.assertEquals(1, new P91_DecodeWays().numDecodings("10"));
    }

    @Test
    public void testNumDecodings5() {
        Assert.assertEquals(0, new P91_DecodeWays().numDecodings("01"));
    }

    @Test
    public void testNumDecodings6() {
        Assert.assertEquals(1, new P91_DecodeWays().numDecodings("101"));
    }
}