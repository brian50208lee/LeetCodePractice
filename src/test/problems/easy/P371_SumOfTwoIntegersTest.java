package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P371_SumOfTwoIntegersTest {
    @Test
    public void testSum() {
        P371_SumOfTwoIntegers p371 = new P371_SumOfTwoIntegers();
        Assert.assertEquals(3, p371.getSum(1,2));
    }

    @Test
    public void testSum2() {
        P371_SumOfTwoIntegers p371 = new P371_SumOfTwoIntegers();
        Assert.assertEquals(1, p371.getSum(-2,3));
    }

    @Test
    public void testSum3() {
        P371_SumOfTwoIntegers p371 = new P371_SumOfTwoIntegers();
        Assert.assertEquals( Integer.MAX_VALUE - 1, p371.getSum(-1, Integer.MAX_VALUE));
    }


    @Test
    public void testSum4() {
        P371_SumOfTwoIntegers p371 = new P371_SumOfTwoIntegers();
        Assert.assertEquals( Integer.MIN_VALUE + 1, p371.getSum(Integer.MIN_VALUE, 1));
    }
}