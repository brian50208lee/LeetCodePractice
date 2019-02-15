package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P53_MaximumSubarrayTest {
    @Test
    public void testMaxSubArray() {
        // given
        P53_MaximumSubarray maximumSubarraySolver = new P53_MaximumSubarray();

        //when

        //then
        Assert.assertEquals(6, maximumSubarraySolver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(-1, maximumSubarraySolver.maxSubArray(new int[]{-1}));
        Assert.assertEquals(1, maximumSubarraySolver.maxSubArray(new int[]{1, -1, 1}));
    }
}