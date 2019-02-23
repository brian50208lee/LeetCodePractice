package problems.medium;

public class P215_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, nums.length - k + 1, 0, nums.length - 1);
    }

    /**
     * k-th smallest
     */
    private int quickSelect(int[] nums, int k, int start, int end) {
        if (start == end) {
            return nums[start];
        }

        int pivot = end;
        int nextFront = start;
        for (int i = start; i < end ; i++) {
            if (nums[i] < nums[pivot]) {
                swap(nums, i, nextFront);
                nextFront++;
            }
        }
        swap(nums, pivot, nextFront);
        pivot = nextFront;

        int sizeToPivot = pivot - start + 1;
        if (sizeToPivot == k) {
            return nums[pivot];
        } else if (sizeToPivot < k) { // go right
            return quickSelect(nums, k - sizeToPivot, pivot + 1, end);
        } else { // go left
            return quickSelect(nums, k, start, pivot - 1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
