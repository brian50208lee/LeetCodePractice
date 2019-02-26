package problems.medium;

public class P322_CoinGame {
    private static final int NO_COMBINATION = -1;

    public int coinChange(int[] coins, int amount) {
        // dp[i] means coinChange(coin, i),
        // dp[i] = min(dp[i-k] + 1), k in coins and dp[i-k] != 0
        // do[0] = 0, do[coin] = 1
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = NO_COMBINATION;
            for (int coin : coins) {
                if (coin == i) {
                    dp[i] = 1;
                } else if (i - coin >= 0 && dp[i - coin] != NO_COMBINATION) {
                    dp[i] = dp[i] == NO_COMBINATION ? dp[i - coin] + 1 : Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if (dp[amount] == NO_COMBINATION) {
            return NO_COMBINATION;
        } else {
            return dp[amount];
        }
    }
}
