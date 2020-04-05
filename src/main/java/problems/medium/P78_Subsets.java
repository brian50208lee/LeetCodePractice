package problems.medium;

import java.util.*;

public class P78_Subsets {
    private List<List<Integer>> results = new ArrayList<>();

    // TODO awesome
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), 0);
        return results;
    }

    private void backtrack(int[] nums, List<Integer> previousTrack, int start) {
        results.add(new ArrayList<>(previousTrack));
        for (int i = start; i < nums.length; i++) {
            previousTrack.add(nums[i]);
            backtrack(nums, previousTrack, i + 1);
            previousTrack.remove(previousTrack.size() - 1);
        }
    }
}
