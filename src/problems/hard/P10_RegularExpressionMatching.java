package problems.hard;

public class P10_RegularExpressionMatching {
    private static final char DOT = '.';
    private static final char STAR = '*';

    /**
     * DP bottom-up
     */
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1]; // dp[i][j] only consider s(0, i) and p(0, j)
        dp[0][0] = true; // s = "", p = ""
        for (int lenP = 1; lenP <= p.length(); lenP++) { // s = "", p = any length
            int indexP = lenP - 1;
            boolean withStar = indexP >= 0 && p.charAt(indexP) == STAR;
            if (withStar) {
                dp[0][lenP] = dp[0][lenP-2];
            } else {
                dp[0][lenP] = false;
            }
        }

        for (int lenS = 1; lenS <= s.length(); lenS++) {
            for (int lenP = 1; lenP <= p.length(); lenP++) {
                int indexS = lenS - 1;
                int indexP = lenP - 1;
                boolean withStar = indexP >= 0 && p.charAt(indexP) == STAR;
                if (withStar) {
                    boolean firstMatch = s.charAt(indexS) == p.charAt(indexP - 1) || p.charAt(indexP - 1) == DOT;
                    dp[lenS][lenP] = firstMatch && dp[lenS - 1][lenP] || dp[lenS][lenP - 2];
                } else {
                    boolean firstMatch = s.charAt(indexS) == p.charAt(indexP) || p.charAt(indexP) == DOT;
                    dp[lenS][lenP] = firstMatch && dp[lenS - 1][lenP - 1];
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    /**
     * recursive && reverse
     */
    public boolean isMatchRecursive(String s, String p) {
        if (p.isEmpty() && s.isEmpty()) {
            return true;
        }
        if (p.isEmpty() && !s.isEmpty()) {
            return false;
        }
        if (!p.isEmpty() && s.isEmpty()) {
            char lastP = p.charAt(p.length() - 1);
            if (lastP == STAR) {
                return isMatchRecursive(s, p.substring(0, p.length() - 2));
            } else {
                return false;
            }
        }


        boolean withStar = p.charAt(p.length() - 1) == STAR;
        if (withStar) {
            boolean matchLast = s.charAt(s.length() - 1) == p.charAt(p.length() - 2) || p.charAt(p.length() - 2) == DOT;
            return matchLast && isMatchRecursive(s.substring(0, s.length() - 1), p)  // match more
                    || isMatchRecursive(s, p.substring(0, p.length() - 2)); // match zero
        } else {
            boolean matchLast = s.charAt(s.length() - 1) == p.charAt(p.length() - 1) || p.charAt(p.length() - 1) == DOT;
            if (matchLast) {
                return isMatchRecursive(s.substring(0, s.length() - 1), p.substring(0, p.length() - 1));
            } else {
                return false;
            }
        }
    }
}
