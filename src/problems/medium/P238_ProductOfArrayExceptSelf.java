package problems.medium;

public class P238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] productFromLeft = new int[nums.length];

        int productToPrevious = 1;
        for (int i = 0; i < nums.length; i++) {
            productFromLeft[i] = productToPrevious;
            productToPrevious *= nums[i];
        }

        productToPrevious = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            productFromLeft[i] *= productToPrevious;
            productToPrevious *= nums[i];
        }

        return productFromLeft;
    }
}
