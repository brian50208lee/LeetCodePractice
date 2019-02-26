package problems.medium;

import java.util.Arrays;

public class P324_WiggleSortII {

    // TODO improve to O(n) time and O(1) space
    public void wiggleSort(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        Arrays.sort(nums);

        int n = nums.length;
        int mid = (n+1) / 2; // 3->2, 4->2
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        reverse(left);
        reverse(right);

        int leftPointer = 0;
        int rightPointer = 0;
        int i = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length) nums[i++] = left[leftPointer++];
            if (rightPointer < right.length) nums[i++] = right[rightPointer++];
        }
    }

    private void reverse(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int tmp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = tmp;
        }
    }
}
