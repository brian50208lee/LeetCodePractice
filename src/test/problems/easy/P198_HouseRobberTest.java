package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P198_HouseRobberTest {
    @Test
    public void testRob() {
        P198_HouseRobber p198 = new P198_HouseRobber();
        Assert.assertEquals(4, p198.rob(new int[]{1,2,3,1}));
    }
    @Test
    public void testRob2() {
        P198_HouseRobber p198 = new P198_HouseRobber();
        Assert.assertEquals(12, p198.rob(new int[]{2,7,9,3,1}));
    }
}