package problems.easy;

public class P26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int lastResultArrayIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[lastResultArrayIndex]) {
                lastResultArrayIndex += 1;
                nums[lastResultArrayIndex] = nums[i];
            }
        }
        return lastResultArrayIndex + 1;
    }
}
