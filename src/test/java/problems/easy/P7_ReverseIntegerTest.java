package problems.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P7_ReverseIntegerTest {

    @Test
    public void testReverse() {
        // given
        P7_ReverseInteger reverseIntegerSolver = new P7_ReverseInteger();

        //when

        //then
        Assert.assertEquals(321, reverseIntegerSolver.reverse(123));
        Assert.assertEquals(-321, reverseIntegerSolver.reverse(-123));
        Assert.assertEquals(21, reverseIntegerSolver.reverse(120));
    }
}