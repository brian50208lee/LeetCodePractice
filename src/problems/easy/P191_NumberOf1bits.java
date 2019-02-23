package problems.easy;

public class P191_NumberOf1bits {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (isBitOn(n, i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isBitOn(int n, int position) {
        return (n & (1 << position)) != 0;
    }
}