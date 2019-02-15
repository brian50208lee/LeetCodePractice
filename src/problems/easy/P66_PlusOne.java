package problems.easy;

public class P66_PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int lastIndex = digits.length - 1;
        for (int i = lastIndex; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] >= 10) {
                carry = digits[i] / 10;
                digits[i] = digits[i] % 10;
            } else {
                return digits;
            }
        }

        if (carry != 0) {
            return addAdditionalOneToHead(digits);
        } else {
            return digits;
        }
    }

    private int[] addAdditionalOneToHead(int[] digits) {
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = digits[i-1];
        }
        return result;
    }
}