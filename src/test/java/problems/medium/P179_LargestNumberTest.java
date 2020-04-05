package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P179_LargestNumberTest {
    @Test
    public void test() {
        P179_LargestNumber p179 = new P179_LargestNumber();
        Assert.assertEquals("210", p179.largestNumber(new int[]{10,2}));
    }

    @Test
    public void test2() {
        P179_LargestNumber p179 = new P179_LargestNumber();
        Assert.assertEquals("9534330", p179.largestNumber(new int[]{3,30,34,5,9}));
    }

    @Test
    public void test3() {
        P179_LargestNumber p179 = new P179_LargestNumber();
        Assert.assertEquals("0", p179.largestNumber(new int[]{0, 0}));
    }
}