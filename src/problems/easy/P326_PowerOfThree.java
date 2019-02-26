package problems.easy;

public class P326_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}
