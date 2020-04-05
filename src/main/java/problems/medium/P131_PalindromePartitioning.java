package problems.medium;

import java.util.ArrayList;
import java.util.List;

public class P131_PalindromePartitioning {
    private List<List<String>> results;

    public List<List<String>> partition(String s) {
        results = new ArrayList<>();
        backtrack(s, new ArrayList<>(), 0);
        return results;
    }

    private void backtrack(String s, List<String> tmpResult, int start) {
        if (start == s.length()) {
            results.add(new ArrayList<>(tmpResult));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String subString = s.substring(start, i+1);
            if (isPalindrome(subString)) {
                tmpResult.add(subString);
                backtrack(s, tmpResult, i+1);
                tmpResult.remove(tmpResult.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
