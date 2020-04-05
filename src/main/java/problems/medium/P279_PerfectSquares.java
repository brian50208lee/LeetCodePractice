package problems.medium;

public class P279_PerfectSquares {
    public int numSquares(int n) {
        // dp[i] means numSquares(i)
        // dp[i] = min(dp[i-j*j] + 1), 1 <= j*j <= i
        // dp[0] = 0
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }
        return dp[n];
    }
}
