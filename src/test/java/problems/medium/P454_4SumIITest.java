package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P454_4SumIITest {
    @Test
    public void test4Sum() {
        // given
        P454_4SumII p454 = new P454_4SumII();
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0,2};

        //when

        //then
        Assert.assertEquals(2, p454.fourSumCount(A, B, C, D));
    }
}