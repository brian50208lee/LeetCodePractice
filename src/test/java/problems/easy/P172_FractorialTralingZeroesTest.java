package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P172_FractorialTralingZeroesTest {
    @Test
    public void testTrailingZeroes() {
        P172_FractorialTralingZeroes p172 = new P172_FractorialTralingZeroes();
        Assert.assertEquals(0, p172.trailingZeroes(3));
    }

    @Test
    public void testTrailingZeroes2() {
        P172_FractorialTralingZeroes p172 = new P172_FractorialTralingZeroes();
        Assert.assertEquals(1, p172.trailingZeroes(5));
    }
    @Test
    public void testTrailingZeroes3() {
        P172_FractorialTralingZeroes p172 = new P172_FractorialTralingZeroes();
        Assert.assertEquals(7, p172.trailingZeroes(30));
    }
}