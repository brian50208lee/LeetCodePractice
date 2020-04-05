package problems.medium;

import java.util.ArrayList;
import java.util.List;

public class P22_GenerateParentheses {
    private List<String> results;

    public List<String> generateParenthesis(int n) {
        results = new ArrayList<>();
        recursive(n);
        return results;
    }

    private void recursive(int n) {
        recursive("", n, n, 0);
    }

    /**
     * @param score = #left - #right
     */
    private void recursive(String path, int remainLeft, int remainRight, int score) {
        if (remainLeft == 0 && remainRight == 0) {
            results.add(path);
            return;
        }

        if (remainLeft > 0) {
            recursive(path + "(", remainLeft - 1, remainRight, score + 1);
        }
        if (remainRight > 0 && score > 0) {
            recursive(path + ")", remainLeft, remainRight - 1, score - 1);
        }
    }
}