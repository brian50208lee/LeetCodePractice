package problems.medium;

public class P33_SeaechInRotatedSortedArray {
    public static final int TARGET_NOT_FOUND = -1;

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return TARGET_NOT_FOUND;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) { // left part is continues
                if (nums[left] <= target && target < nums[mid]) { // go left
                    right = mid;
                } else { // go right
                    left = mid + 1;
                }
            } else { // right part is continues
                if (nums[mid] < target && target <= nums[right]) { // go right
                    left = mid + 1;
                } else { // go left
                    right = mid;
                }
            }
        }

        if (nums[left] == target) {
            return left;
        } else {
            return TARGET_NOT_FOUND;
        }
    }
}
