package problems.easy;

public class P35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length < 1) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        if (target <= nums[left]) {
            return left;
        } else {
            return left + 1;
        }
    }
}