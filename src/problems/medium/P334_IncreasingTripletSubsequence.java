package problems.medium;

public class P334_IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return false;
        }
        int min = nums[0];
        int minOfLengthTwo = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minOfLengthTwo) {
                return true;
            }
            if (min < nums[i] && nums[i] < minOfLengthTwo) {
                minOfLengthTwo = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }
        return false;
    }
}


