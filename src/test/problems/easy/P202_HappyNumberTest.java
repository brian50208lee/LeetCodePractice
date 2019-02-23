package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P202_HappyNumberTest {
    @Test
    public void testIsHappy() {
        Assert.assertEquals(true, new P202_HappyNumber().isHappy(19));
    }
}