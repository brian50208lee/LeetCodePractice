package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P38_CountAndSayTest {
    @Test
    public void testCountAndSay() {
        // given
        P38_CountAndSay countAndSaySolver = new P38_CountAndSay();

        //when

        //then
        Assert.assertEquals("1", countAndSaySolver.countAndSay(1));
        Assert.assertEquals("1211", countAndSaySolver.countAndSay(4));
    }
}