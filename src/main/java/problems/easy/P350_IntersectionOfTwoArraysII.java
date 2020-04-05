package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numToFreq = new HashMap<>();
        for (int num : nums1) {
            numToFreq.put(num, numToFreq.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (numToFreq.containsKey(num) && numToFreq.get(num) > 0) {
                result.add(num);
                numToFreq.put(num, numToFreq.get(num) - 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
