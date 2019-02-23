package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class P169_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int newCount = counts.getOrDefault(nums[i], 0) + 1;
            counts.put(nums[i], newCount);
            if (newCount > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
