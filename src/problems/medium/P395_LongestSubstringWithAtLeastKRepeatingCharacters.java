package problems.medium;

public class P395_LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        if (s == null || s.isEmpty() || k > s.length()) {
            return 0;
        }
        return recursive(s.toCharArray(), k, 0, s.length() - 1);
    }

    private int recursive(char[] s, int k, int start, int end) {
        int len = end - start + 1;
        if (len < k) {
            return 0;
        }

        int[] charCount = countCharacter(s, start, end);
        if (containCharCountLessThanK(charCount, k)) {
            int max = 0;
            for (int i = start; i <= end; i++) {
                if (charCount[s[i]-'a'] < k) {
                    // any substring contain this char can not success. split it
                    max = Math.max(max, recursive(s, k, start, i - 1));
                    start = i + 1;
                }
            }
            // rest part
            max = Math.max(max, recursive(s, k, start, end));
            return max;
        } else {
            return len;
        }

    }

    private int[] countCharacter(char[] s, int start, int end) {
        int[] charCount = new int[26];
        for (int i = start; i <= end; i++) {
            charCount[s[i]-'a']++;
        }
        return charCount;
    }

    private boolean containCharCountLessThanK(int[] charCount, int k) {
        for (int count : charCount) {
            if (0 < count && count < k) {
                return true;
            }
        }
        return false;
    }
}
