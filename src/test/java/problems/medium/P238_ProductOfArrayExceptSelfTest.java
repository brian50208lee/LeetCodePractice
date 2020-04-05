package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P238_ProductOfArrayExceptSelfTest {
    @Test
    public void testProduct() {
        // given
        P238_ProductOfArrayExceptSelf p238 = new P238_ProductOfArrayExceptSelf();
        int[] nums = {1,2,3,4};
        int[] expected = {24,12,8,6};

        //when

        //then
        Assert.assertArrayEquals(expected, p238.productExceptSelf(nums));
    }

    @Test
    public void testProduct2() {
        // given
        P238_ProductOfArrayExceptSelf p238 = new P238_ProductOfArrayExceptSelf();
        int[] nums = {0,1,2,3};
        int[] expected = {6,0,0,0};

        //when

        //then
        Assert.assertArrayEquals(expected, p238.productExceptSelf(nums));
    }
}