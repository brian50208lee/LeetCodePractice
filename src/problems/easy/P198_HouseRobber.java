package problems.easy;

public class P198_HouseRobber {
    public int rob(int[] nums) {
        int includeThis = 0;
        int excludeThis = 0;
        for (int num : nums) {
            int includePrevious = includeThis;
            int excludePrevious = excludeThis;
            includeThis = excludePrevious + num;
            excludeThis = Math.max(excludePrevious, includePrevious);
        }
        return Math.max(excludeThis, includeThis);
    }
}
