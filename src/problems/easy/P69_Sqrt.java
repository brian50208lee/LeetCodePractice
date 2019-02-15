package problems.easy;

public class P69_Sqrt {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while(left < right) {
            int middle = left + (right - left) / 2;
            if (x/middle == middle) {
                return middle;
            } else if (x/middle < middle) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        if (x/left < left) {
            return left - 1;
        } else {
            return left;
        }
    }
}
