package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P191_NumberOf1bitsTest {
    @Test
    public void testHammingWeight() {
        P191_NumberOf1bits p191 = new P191_NumberOf1bits();
        Assert.assertEquals(3, p191.hammingWeight(0b00000000000000000000000000001011));
    }

    @Test
    public void testHammingWeight2() {
        P191_NumberOf1bits p191 = new P191_NumberOf1bits();
        Assert.assertEquals(1, p191.hammingWeight(0b00000000000000000000000010000000));
    }

    @Test
    public void testHammingWeight3() {
        P191_NumberOf1bits p191 = new P191_NumberOf1bits();
        Assert.assertEquals(31, p191.hammingWeight(0b11111111111111111111111111111101));
    }
}