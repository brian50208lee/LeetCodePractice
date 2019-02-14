package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class P1_TwoSum {
    private final int[] DEFAULT_RESULT = new int[]{-1, -1};

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complementNum = target - num;
            if (numToIndexMap.containsKey(complementNum)) {
                int complementIndex = numToIndexMap.get(complementNum);
                int[] result = new int[]{i, complementIndex};
                return result;
            } else {
                numToIndexMap.put(num, i);
            }
        }
        return DEFAULT_RESULT;
    }
}
