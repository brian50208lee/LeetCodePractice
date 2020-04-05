package problems.medium;

public class P50_Pow {

    // TODO awesome
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n == 1) {
            return x;
        }

        if (n == -1) {
            return 1/x;
        }

        if (n % 2 == 0) {
            return myPow(x*x, n/2);
        } else {
            double rest = n < 0 ? 1 / x : x;
            return rest * Math.pow(x*x, n/2);
        }
    }
}
