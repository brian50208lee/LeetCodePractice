package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P69_SqrtTest {
    @Test
    public void testMySqrt() {
        // given
        P69_Sqrt sqrtSolver = new P69_Sqrt();

        //when

        //then
        Assert.assertEquals(2, sqrtSolver.mySqrt(4));
        Assert.assertEquals(2, sqrtSolver.mySqrt(8));
    }
}