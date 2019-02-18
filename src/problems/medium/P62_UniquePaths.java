package problems.medium;

public class P62_UniquePaths {
    public int uniquePaths(int m, int n) {

        return dp(m, n);
    }

    public int dp(int m, int n) {
        if (m < 1 || n < 1) {
            return 0;
        }

        int[][] dp = new int[m][n];
        for (int c = 0; c < dp[0].length; c++) {
            dp[0][c] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (j - 1 < 0) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
    }
}
