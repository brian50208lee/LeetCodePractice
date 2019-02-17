package problems.medium;

public class P34_FindFirstAndLsatPositionOfElementInSortedArray {
    private static int TARGET_NOT_FOUND = -1;

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{TARGET_NOT_FOUND, TARGET_NOT_FOUND};
        }

        int index = binarySearch(nums, 0, nums.length - 1, target);
        return extendIndex(nums, target, index);
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        if (left == right) {
            if (nums[left] == target) {
                return left;
            } else {
                return -1;
            }
        }

        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, right, target);
        } else {
            return binarySearch(nums, left, mid, target);
        }
    }

    private int[] extendIndex(int[] nums, int target, int index) {
        if (index == TARGET_NOT_FOUND) {
            return new int[]{TARGET_NOT_FOUND, TARGET_NOT_FOUND};
        }

        int leftPosition = index;
        int rightPosition = index;
        int lastIndex = nums.length - 1;
        while (leftPosition != 0 && nums[leftPosition-1] == target) {
            leftPosition--;
        }
        while (rightPosition != lastIndex && nums[rightPosition+1] == target) {
            rightPosition++;
        }
        return new int[]{leftPosition, rightPosition};
    }
}

