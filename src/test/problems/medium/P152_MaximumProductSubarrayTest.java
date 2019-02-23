package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P152_MaximumProductSubarrayTest {
    @Test
    public void testMaxProduct() {
        P152_MaximumProductSubarray p152 = new P152_MaximumProductSubarray();
        Assert.assertEquals(6, p152.maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    public void testMaxProduct2() {
        P152_MaximumProductSubarray p152 = new P152_MaximumProductSubarray();
        Assert.assertEquals(0, p152.maxProduct(new int[]{-2,0,-1}));
    }

    @Test
    public void testMaxProduct3() {
        P152_MaximumProductSubarray p152 = new P152_MaximumProductSubarray();
        Assert.assertEquals(-2, p152.maxProduct(new int[]{-2}));
    }
}