package problems.medium;

public class P162_FindPeakElement {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean greaterThanLeft = i - 1 < 0 || nums[i-1] < nums[i];
            boolean greaterhanRight = i + 1 >= nums.length || nums[i] > nums[i+1];
            if (greaterThanLeft && greaterhanRight) {
                return i;
            }
        }
        return -1;
    }
}
