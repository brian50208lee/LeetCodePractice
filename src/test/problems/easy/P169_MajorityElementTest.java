package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P169_MajorityElementTest {
    @Test
    public void testMajorityElement() {
        P169_MajorityElement p169 = new P169_MajorityElement();
        Assert.assertEquals(3, p169.majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void testMajorityElement2() {
        P169_MajorityElement p169 = new P169_MajorityElement();
        Assert.assertEquals(2, p169.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}