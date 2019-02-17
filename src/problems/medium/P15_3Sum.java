package problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        return kSum(nums, 0, nums.length -1, 0, 3);
    }

    // TODO general case for ksum
    public List<List<Integer>> kSum(int[] sortedNums, int start, int end, int target, int k) {
        List<List<Integer>> results = new ArrayList<>();
        if (k == 2) {
            return twoSum(sortedNums, start, end, target);
        } else {
            int lastIndex = sortedNums.length - k;
            for (int i = 0; i <= lastIndex; i++) {
                int selectedNum = sortedNums[i];
                List<List<Integer>> recursiveResults = kSum(sortedNums, i + 1, end, target - selectedNum, k - 1);
                for (List<Integer> list : recursiveResults) {
                    list.add(0, selectedNum);
                }
                results.addAll(recursiveResults);
                while (i != lastIndex && sortedNums[i] == sortedNums[i+1]) {
                    i++;
                }
            }
        }
        return results;
    }

    public List<List<Integer>> twoSum(int[] sortedNums, int start, int end, int target) {
        List<List<Integer>> results = new ArrayList<>();
        while (start < end) {
            if (sortedNums[start] + sortedNums[end] < target) {
                start++;
            } else if (sortedNums[start] + sortedNums[end] > target) {
                end--;
            } else { // found answer
                results.add(new ArrayList<>(Arrays.asList(sortedNums[start], sortedNums[end])));
                while (start < end && sortedNums[start] == sortedNums[start+1]) {
                    start++;
                }
                while (start < end && sortedNums[end] == sortedNums[end-1]) {
                    end--;
                }
                start++;
                end--;
            }
        }
        return results;
    }
}
