package problems.medium;

public class P91_DecodeWays {
    public int numDecodings(String s) {
        if (s.isEmpty() || !isValidDigit(s.substring(0, 1))) {
            return 0;
        }

        if (s.length() == 1) {
            return isValidDigit(s.substring(0, 1)) ? 1 : 0;
        }

        int[] dp = new int[s.length()]; // dp[i] means only consider first (i+1) chars
        dp[0] = isValidDigit(s.substring(0, 1)) ? 1 : 0;

        for (int i = 1; i < s.length(); i++) { // dp[i] = dp[i-1] + dp[i-2]
            if (isValidDigit(s.substring(i, i+1))) {
                dp[i] += dp[i-1];
            }
            if (isValidDigit(s.substring(i-1, i+1))) {
                dp[i] += i - 2 >= 0 ? dp[i-2] : 1;
            }
        }
        return dp[s.length()-1];
    }

    private boolean isValidDigit(String s) {
        if (Integer.valueOf(s) > 26) {
            return false;
        } else if (Integer.valueOf(s) < 1) {
            return false;
        } else if (s.length() == 2 && s.startsWith("0")) {
            return false;
        }
        return true;
    }
}
