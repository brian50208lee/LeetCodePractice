package problems.easy;

public class P189_RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1) {
            return;
        }

        k = k % nums.length;
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0 , nums.length - k - 1);
        reverse(nums, 0 , nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        for (int i = 0; i < (end - start + 1) / 2; i++) {
            int tmp = nums[start + i];
            nums[start + i] = nums[end - i];
            nums[end - i] = tmp;
        }
    }
}