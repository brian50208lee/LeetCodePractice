package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P70_ClimbingStairsTest {
    @Test
    public void testClimbStairs() {
        // given
        P70_ClimbingStairs climbingStairsSolver = new P70_ClimbingStairs();

        //when

        //then
        Assert.assertEquals(2, climbingStairsSolver.climbStairs(2));
        Assert.assertEquals(3, climbingStairsSolver.climbStairs(3));
    }
}