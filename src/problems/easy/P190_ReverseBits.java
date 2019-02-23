package problems.easy;

public class P190_ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (isBitOn(n, i)) {
                result = setBitOn(result, 31-i);
            }
        }
        return result;
    }

    private boolean isBitOn(int n, int position) {
        return (n & (1 << position)) != 0;
    }

    private int setBitOn(int n, int position) {
        return n | (1 << position);
    }
}
