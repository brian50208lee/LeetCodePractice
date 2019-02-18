package problems.structure;

import org.junit.Assert;
import org.junit.Test;

public class IntervalTest {

    @Test
    public void testEquals() {
        // given
        Interval interval1 = new Interval(1, 2);
        Interval interval2 = new Interval(0, 2);

        //when

        //then
        Assert.assertEquals(true, interval1.equals(interval1));
        Assert.assertEquals(false, interval1.equals(interval2));
    }

}