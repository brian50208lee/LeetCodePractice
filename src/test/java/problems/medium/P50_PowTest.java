package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P50_PowTest {
    @Test
    public void test() {
        // given
        P50_Pow p50 = new P50_Pow();
        
        //when
        
        //then
        double delta = 0.00001;
        Assert.assertEquals(1024.00000, p50.myPow(2.00000, 10), delta);
        Assert.assertEquals(9.26100, p50.myPow(2.10000, 3), delta);
        Assert.assertEquals(0.25000, p50.myPow(2.00000, -2), delta);
        Assert.assertEquals(0.0, p50.myPow(2.00000, Integer.MIN_VALUE), delta);
    }
}