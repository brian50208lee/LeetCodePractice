package problems.medium;

public class P8_StringToInteger {
    public int myAtoi(String str) {
        // remove leading space
        str = str.trim();

        // empty string
        if (str == null || str.length() == 0) {
            return 0;
        }

        // handle sign
        boolean isPositive = true;
        if (str.charAt(0) == '+') {
            isPositive = true;
            str = str.substring(1);
        } else if (str.charAt(0) == '-') {
            isPositive = false;
            str = str.substring(1);
        }

        // not start with digit
        if (str.length() == 0 || !Character.isDigit(str.charAt(0))) {
            return 0;
        }

        // remove behind digit
        int firstNotDigitIndex = 0;
        while (firstNotDigitIndex < str.length() && Character.isDigit(str.charAt(firstNotDigitIndex))) {
            firstNotDigitIndex++;
        }
        str = str.substring(0, firstNotDigitIndex);

        // parse to integer
        int result = 0;
        if (isPositive) {
            try {
                result = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                result = Integer.MAX_VALUE;
            }
        } else {
            try {
                result = 0 - Integer.parseInt(str);
            } catch (NumberFormatException e) {
                result = Integer.MIN_VALUE;
            }
        }
        return result;
    }
}
