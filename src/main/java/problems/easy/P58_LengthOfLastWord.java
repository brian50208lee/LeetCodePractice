package problems.easy;

public class P58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        s = s.trim();
        int lastIndex = s.length() - 1;
        for (int i = lastIndex; i >= 0 ; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                return lastIndex - i;
            }
        }
        return s.length();
    }
}
