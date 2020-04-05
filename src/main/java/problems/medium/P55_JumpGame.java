package problems.medium;

public class P55_JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }

        if (nums.length <=1){
            return true;
        }


        int maxReachedIndex = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i > maxReachedIndex) {
                break;
            } else {
                maxReachedIndex = Math.max(maxReachedIndex, i + nums[i]);
            }
        }

        int lastIndex = nums.length - 1;
        return maxReachedIndex >= lastIndex;
    }
}
