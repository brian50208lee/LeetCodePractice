package problems.easy;

public class P172_FractorialTralingZeroes {
    public int trailingZeroes(int n) {
        int trailingZero = 0;
        while (n > 0) {
            trailingZero += n / 5;
            n /= 5;
        }
        return trailingZero;
    }
}
