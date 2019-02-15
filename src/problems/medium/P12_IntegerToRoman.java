package problems.medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class P12_IntegerToRoman {
    private final Map<Integer, String> valueToSymbol = new LinkedHashMap<>();

    public P12_IntegerToRoman() {
        valueToSymbol.put(1000, "M");
        valueToSymbol.put(900, "CM");
        valueToSymbol.put(500, "D");
        valueToSymbol.put(400, "CD");
        valueToSymbol.put(100, "C");
        valueToSymbol.put(90, "XC");
        valueToSymbol.put(50, "L");
        valueToSymbol.put(40, "XL");
        valueToSymbol.put(10, "X");
        valueToSymbol.put(9, "IX");
        valueToSymbol.put(5, "V");
        valueToSymbol.put(4, "IV");
        valueToSymbol.put(1, "I");
    }

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        for (Integer value : valueToSymbol.keySet()) {
            while (num >= value) {
                result.append(valueToSymbol.get(value));
                num -= value;
            }
        }
        return result.toString();
    }
}
