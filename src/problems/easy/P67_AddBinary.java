package problems.easy;

public class P67_AddBinary {
    private static final int BASE = 2;

    public String addBinary(String a, String b) {
        StringBuilder reversedResult = new StringBuilder();
        String reversedA = new StringBuilder(a).reverse().toString();
        String reversedB = new StringBuilder(b).reverse().toString();

        int carry = 0;
        int maxLength = Math.max(reversedA.length(), reversedB.length());
        for (int i = 0; i < maxLength; i++) {
            int valueA = i < reversedA.length() ? Character.getNumericValue(reversedA.charAt(i)) : 0;
            int valueB = i < reversedB.length() ? Character.getNumericValue(reversedB.charAt(i)) : 0;
            int sum = (valueA + valueB + carry);
            carry = sum / BASE;
            sum = sum % BASE;
            reversedResult.append(sum);
        }

        if (carry != 0) {
            reversedResult.append(carry);
        }

        return reversedResult.reverse().toString();
    }
}