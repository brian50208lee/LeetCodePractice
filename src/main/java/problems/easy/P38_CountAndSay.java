package problems.easy;

public class P38_CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String previousString = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        char currentChar = previousString.charAt(0);
        int charCount = 1;
        for (int i = 1; i < previousString.length(); i++) {
            char c = previousString.charAt(i);
            if (c != currentChar) {
                result.append(generateString(currentChar, charCount));
                currentChar = c;
                charCount = 1;
            } else {
                charCount++;
            }
        }
        result.append(generateString(currentChar, charCount));
        return result.toString();
    }

    private String generateString(char currentChar, int charCount) {
        return charCount + "" + currentChar;
    }
}