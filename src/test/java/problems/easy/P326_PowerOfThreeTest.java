package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P326_PowerOfThreeTest {
    @Test
    public void testIsPowerOfThree() {
        P326_PowerOfThree p326 = new P326_PowerOfThree();
        Assert.assertTrue(p326.isPowerOfThree(27));
    }

    @Test
    public void testIsPowerOfThree2() {
        P326_PowerOfThree p326 = new P326_PowerOfThree();
        Assert.assertFalse(p326.isPowerOfThree(0));
    }

    @Test
    public void testIsPowerOfThree3() {
        P326_PowerOfThree p326 = new P326_PowerOfThree();
        Assert.assertTrue(p326.isPowerOfThree(9));
    }

    @Test
    public void testIsPowerOfThree4() {
        P326_PowerOfThree p326 = new P326_PowerOfThree();
        Assert.assertFalse(p326.isPowerOfThree(45));
    }
}