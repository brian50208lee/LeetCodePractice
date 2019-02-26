package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P279_PerfectSquaresTest {
    @Test
    public void testPerfectSquares() {
        P279_PerfectSquares p279 = new P279_PerfectSquares();
        Assert.assertEquals(3, p279.numSquares(12));
    }

    @Test
    public void testPerfectSquares2() {
        P279_PerfectSquares p279 = new P279_PerfectSquares();
        Assert.assertEquals(2, p279.numSquares(13));
    }


    @Test
    public void testPerfectSquares3() {
        P279_PerfectSquares p279 = new P279_PerfectSquares();
        Assert.assertEquals(3, p279.numSquares(12));
    }
}