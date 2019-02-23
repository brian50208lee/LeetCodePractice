package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P204_CountPrimesTest {
    @Test
    public void testCountPrimes() {
        Assert.assertEquals(4, new P204_CountPrimes().countPrimes(10));
    }
    @Test
    public void testCountPrimes2() {
        Assert.assertEquals(0, new P204_CountPrimes().countPrimes(1));
    }
    @Test
    public void testCountPrimes3() {
        Assert.assertEquals(0, new P204_CountPrimes().countPrimes(-1));
    }
}