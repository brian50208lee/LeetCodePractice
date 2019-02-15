package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P66_PlusOneTest {
    @Test
    public void testPlusOne() {
        // given
        P66_PlusOne plusOneSolver = new P66_PlusOne();

        //when

        //then
        Assert.assertArrayEquals(new int[]{1,2,4}, plusOneSolver.plusOne(new int[]{1,2,3}));
        Assert.assertArrayEquals(new int[]{4,3,2,2}, plusOneSolver.plusOne(new int[]{4,3,2,1}));
    }
}