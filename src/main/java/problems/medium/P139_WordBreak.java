package problems.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return dp(s, wordSet);
    }

    public boolean wordBreakBackTrack(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return backtrack(s, wordSet, 0);
    }

    private boolean dp(String s, Set<String> wordSet) {
        boolean[] dp = new boolean[s.length() + 1]; // dp[i] means length i can be break
        dp[0] = true;
        for (int start = 1; start <= s.length(); start++) {
            for (int end = start; end <= s.length() ; end++) {
                if (dp[start-1] && wordSet.contains(s.substring(start - 1, end))) {
                    dp[end] = true;
                }
            }
        }
        return dp[s.length()];
    }

    private boolean backtrack(String s, Set<String> wordSet, int start) {
        if (start == s.length()) {
            return true;
        }
        for (int i = start; i <= s.length() - 1; i++) {
            String word = s.substring(start, i + 1);
            if (wordSet.contains(word) && backtrack(s, wordSet, i + 1)) {
                return true;
            }
        }
        return false;
    }
}
