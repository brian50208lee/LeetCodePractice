package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P122_BestTimeToBuyAndSellStockIITest {
    @Test
    public void test1() {
        Assert.assertEquals(7, new P122_BestTimeToBuyAndSellStockII().maxProfit(new int[]{7,1,5,3,6,4}));
    }
    @Test
    public void test2() {
        Assert.assertEquals(4, new P122_BestTimeToBuyAndSellStockII().maxProfit(new int[]{1,2,3,4,5}));
    }
    @Test
    public void test3() {
        Assert.assertEquals(0, new P122_BestTimeToBuyAndSellStockII().maxProfit(new int[]{7,6,4,3,1}));
    }
}