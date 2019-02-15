package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class P13_RomanToInteger {

    private Map<Character, Integer> symbolToValue;

    public P13_RomanToInteger() {
        symbolToValue = new HashMap<>();
        symbolToValue.put('M', 1000);
        symbolToValue.put('D', 500);
        symbolToValue.put('C', 100);
        symbolToValue.put('L', 50);
        symbolToValue.put('X', 10);
        symbolToValue.put('V', 5);
        symbolToValue.put('I', 1);
    }

    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int lastIndex = charArray.length - 1;
        int previousValue = symbolToValue.get(charArray[lastIndex]);
        int result = previousValue;
        for (int i = lastIndex - 1; i >= 0; i--) {
            int value = symbolToValue.get(charArray[i]);
            if (value < previousValue) {
                result -= value;
            } else {
                result += value;
            }
            previousValue = value;
        }
        return result;
    }
}