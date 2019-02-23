package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P121_BestTimeToBuyAndSellStockTest {
    @Test
    public void test1() {
        Assert.assertEquals(5, new P121_BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, new P121_BestTimeToBuyAndSellStock().maxProfit(new int[]{7,6,4,3,1}));
    }
}