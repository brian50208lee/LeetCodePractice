package problems.easy;

public class P9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] charArray = Integer.toString(x).toCharArray();
        int lastIndex = charArray.length - 1;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[lastIndex - i]) {
                return false;
            }
        }
        return true;
    }
}
