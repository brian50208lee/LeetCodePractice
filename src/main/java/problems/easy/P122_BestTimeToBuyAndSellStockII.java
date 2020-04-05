package problems.easy;

public class P122_BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i-1]) {
                maxProfit += prices[i-1] - minPrice;
                minPrice = prices[i];
            } else {
                minPrice = Math.min(minPrice, prices[i]);
            }
        }
        maxProfit += prices[prices.length-1] - minPrice;

        return maxProfit;
    }
}
