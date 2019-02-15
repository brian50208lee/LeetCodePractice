package problems.easy;

public class P14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minStrLength = findMinLength(strs);

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < minStrLength; i++) {
            if (hasCommonPrefix(strs)) {
                commonPrefix.append(strs[0].charAt(0));
                strs = ltrim(strs);
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }

    private int findMinLength(String[] strs) {
        int minStrLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minStrLength) {
                minStrLength = str.length();
            }
        }
        return minStrLength;
    }

    private boolean hasCommonPrefix(String[] strs) {
        char c = strs[0].charAt(0);
        for (String str : strs) {
            if (str.charAt(0) != c) {
                return false;
            }
        }
        return true;
    }

    private String[] ltrim(String[] strs) {
        String[] results = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            results[i] = strs[i].substring(1);
        }
        return results;
    }
}
