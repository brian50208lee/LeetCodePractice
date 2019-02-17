package problems.medium;

public class P29_DivideTwoIntegers {
    // TODO very slow, need to sppeed up (increase divisor by loop)
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) { // case for over flow
            return Integer.MAX_VALUE;
        }

        if (dividend == divisor) {
            return 1;
        }

        int quotient = 0;
        if (dividend > 0 && divisor > 0) {
            while (dividend - divisor >= 0) {
                dividend -= divisor;
                quotient++;
            }
        } else if (dividend > 0 && divisor < 0) {
            while (dividend + divisor >= 0) {
                dividend += divisor;
                quotient--;
            }
        } else if (dividend < 0 && divisor > 0) {
            while (dividend + divisor <= 0) {
                dividend += divisor;
                quotient--;
            }
        } else if (dividend < 0 && divisor < 0) {
            while (dividend - divisor <= 0) {
                dividend -= divisor;
                quotient++;
            }
        }
        return quotient;
    }
}
