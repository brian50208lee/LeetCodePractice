package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P190_ReverseBitsTest {
    @Test
    public void testReverseBits() {
        P190_ReverseBits p190 = new P190_ReverseBits();
        int n = 0b00000010100101000001111010011100;
        int expected = 0b00111001011110000010100101000000;
        Assert.assertEquals(expected, p190.reverseBits(n));
    }

    @Test
    public void testReverseBits2() {
        P190_ReverseBits p190 = new P190_ReverseBits();
        int n = 0b11111111111111111111111111111101;
        int expected = 0b10111111111111111111111111111111;
        Assert.assertEquals(expected, p190.reverseBits(n));
    }
}