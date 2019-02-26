package problems.easy;

public class P283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        // insertion sort
        int numberOfZeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numberOfZeroes++;
            } else {
                nums[i-numberOfZeroes] = nums[i];
            }
        }
        for (int i = nums.length - numberOfZeroes; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
