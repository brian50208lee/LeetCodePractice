package problems.medium;

import java.util.*;

public class P17_LetterCombinationOfPhoneNumber {

    private static final Map<String, List<String>> letters;

    static {
        letters = new HashMap<>();
        letters.put("2", Arrays.asList("a", "b", "c"));
        letters.put("3", Arrays.asList("d", "e", "f"));
        letters.put("4", Arrays.asList("g", "h", "i"));
        letters.put("5", Arrays.asList("j", "k", "l"));
        letters.put("6", Arrays.asList("m", "n", "o"));
        letters.put("7", Arrays.asList("p", "q", "r", "s"));
        letters.put("8", Arrays.asList("t", "u", "v"));
        letters.put("9", Arrays.asList("w", "x", "y", "z"));
    }


    public List<String> letterCombinations(String digits) {
        return recursiveCombination(digits);
    }

    public List<String> recursiveCombination(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        return recursiveCombination(digits, new ArrayList<>(Arrays.asList("")));
    }

    private List<String> recursiveCombination(String digits, List<String> previousResults) {
        if (digits.length() == 0) {
            return previousResults;
        }

        List<String> results = new ArrayList<>();
        String d = digits.charAt(0) + "";
        List<String> alphabet = letters.get(d);
        for (String previousResult : previousResults) {
            for (String symbol : alphabet) {
                results.add(previousResult + symbol);
            }
        }
        return recursiveCombination(digits.substring(1), results);
    }
}
