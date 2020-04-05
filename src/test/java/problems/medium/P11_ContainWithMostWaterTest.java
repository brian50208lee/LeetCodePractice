package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P11_ContainWithMostWaterTest {
    @Test
    public void testMaxArea() {
        // given
        P11_ContainWithMostWater p11 = new P11_ContainWithMostWater();

        //when

        //then
        Assert.assertEquals(49, p11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}