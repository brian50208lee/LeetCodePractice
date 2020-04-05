package problems.medium;

import java.util.HashSet;
import java.util.Set;

public class P3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> chars = new HashSet<>();
        int maxSize = Integer.MIN_VALUE;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (chars.contains(c)) {
                while (chars.contains(c)) {
                    chars.remove(s.charAt(start));
                    start++;
                }
            }
            chars.add(c);
            maxSize = Math.max(maxSize, chars.size());
        }

        return maxSize;
    }
}
