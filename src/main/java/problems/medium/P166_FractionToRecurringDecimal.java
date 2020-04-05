package problems.medium;

import java.util.HashMap;
import java.util.Map;

public class P166_FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        String sign = buildSignPart(numerator, denominator);
        String integer = buildIntegerPart(numerator, denominator);
        String fraction = buildFractionPart(numerator, denominator);
        return sign + integer + fraction;
    }

    private String buildSignPart(long numerator, long denominator) {
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
            return "-";
        } else {
            return "";
        }
    }

    private String buildIntegerPart(long numerator, long denominator) {
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        return Long.toString(numerator / denominator);
    }

    private String buildFractionPart(long numerator, long denominator) {
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        long ramain = numerator % denominator;
        if (ramain == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder(".");
        Map<Long, Integer> firstAppearIndexOfRemain = new HashMap<>();
        while (ramain != 0 && !firstAppearIndexOfRemain.containsKey(ramain)) {
            firstAppearIndexOfRemain.put(ramain, sb.length());
            String nextFraction = Long.toString(ramain * 10 / denominator);
            sb.append(nextFraction);
            ramain = ramain * 10 % denominator;
        }
        if (ramain != 0) {
            int starIndex = firstAppearIndexOfRemain.get(ramain);
            sb.insert(starIndex, "(");
            sb.append(")");
        }
        return sb.toString();
    }
}
