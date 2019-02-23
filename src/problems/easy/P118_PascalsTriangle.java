package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class P118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            results.add(new ArrayList<>());
        }
        results.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousLevel = results.get(i - 1);
            List<Integer> currentLevel = results.get(i);
            currentLevel.add(1);
            for (int j = 0; j < previousLevel.size() - 1; j++) {
                int newValue = previousLevel.get(j) + previousLevel.get(j + 1);
                currentLevel.add(newValue);
            }
            currentLevel.add(1);
        }

        return results;
    }
}
