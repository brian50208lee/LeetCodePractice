package problems.easy;

public class P28_ImplementStrStr {
    private static int NOT_PART_OF_HAYSTACK = -1;

    public int strStr(String haystack, String needle) {
        if (haystack == null || haystack.length() == 0) {
            return NOT_PART_OF_HAYSTACK;
        }

        if (needle == null || needle.length() == 0) {
            return 0;
        }

        int lastIndexToCheck = haystack.length() - needle.length();
        for (int i = 0; i <= lastIndexToCheck ; i++) {
            if (haystack.substring(i).startsWith(needle)) {
                return i;
            }
        }

        return NOT_PART_OF_HAYSTACK;
    }
}
