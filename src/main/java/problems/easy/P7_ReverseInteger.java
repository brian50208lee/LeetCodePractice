package problems.easy;

public class P7_ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int newResult =  result*10 + x%10;
            if (isOverflow(result, newResult)) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }

        return result;
    }

    private boolean isOverflow(int originVal, int newVal) {
        return originVal != newVal / 10;
    }
}

