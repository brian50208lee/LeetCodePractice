package problems.medium;

public class P5_LongestPalindromicSubstring {

    /**
     * dp[i][j] = dp[i+1][j-1] if s[i] == s[j]
     * dp[i][j] = false if s[i] != s[j]
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];

        // length = 1
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        // length = 2
        for (int i = 0; i < s.length() - 1; i++) {
            dp[i][i+1] = s.charAt(i) == s.charAt(i+1) ? true : false;
        }

        // length > 2
        for (int len = 3; len <= s.length(); len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                int j = i + len - 1;
                dp[i][j] = s.charAt(i) == s.charAt(j) ? dp[i+1][j-1] : false;
            }
        }

        return  trasferToString(dp, s);
    }

    private String trasferToString(boolean[][] dp, String s) {
        String result = "";
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i <= j && dp[i][j]) {
                    int len = j - i + 1;
                    if (len > result.length()) {
                        result = s.substring(i, j+1);
                    }
                }
            }
        }
        return result;
    }
}
