package problems.easy;

public class P27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int lastResultArrayIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                lastResultArrayIndex += 1;
                nums[lastResultArrayIndex] = nums[i];
            }
        }
        return lastResultArrayIndex + 1;
    }
}
