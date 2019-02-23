package problems.medium;

public class P152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int globalMax = Integer.MIN_VALUE;
        int maxProduct = 0;
        int minProduct = 0;
        for (int num : nums) {
            int max = Math.max(maxProduct * num, minProduct * num);
            int min = Math.min(maxProduct * num, minProduct * num);
            maxProduct = max;
            minProduct = min;
            if (maxProduct <= 0) {
                maxProduct = num;
            }
            if (minProduct >= 0) {
                minProduct = num;
            }
            globalMax = Math.max(globalMax, maxProduct);
        }
        return globalMax;
    }
}
