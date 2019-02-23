package problems.medium;

import java.util.ArrayList;
import java.util.List;

public class P46_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        return permuteLoop(nums);
    }

    public List<List<Integer>> permuteLoop(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        results.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> newResults = new ArrayList<>();
            for (List<Integer> sub : results) {
                for (int insertIndex = 0; insertIndex <= sub.size(); insertIndex++) {
                    List<Integer> copy = new ArrayList<>(sub);
                    copy.add(insertIndex, nums[i]);
                    newResults.add(copy);
                }
            }
            results = newResults;
        }
        return results;
    }
}
