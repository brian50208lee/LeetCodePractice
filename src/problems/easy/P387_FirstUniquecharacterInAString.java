package problems.easy;

public class P387_FirstUniquecharacterInAString {
    private static int NOT_EXIST = -1;

    public int firstUniqChar(String s) {
        int[] freq = new int[255];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }
        return NOT_EXIST;
    }
}
