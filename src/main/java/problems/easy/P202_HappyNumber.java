package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class P202_HappyNumber {
    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }

        Set<Integer> exsist = new HashSet<>();
        while (!exsist.contains(n)) {
            if (n == 1) {
                return true;
            }
            exsist.add(n);
            n = digitsSquareSum(n);
        }
        return false;
    }

    private int digitsSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit * digit;
        }
        return sum;
    }
}
