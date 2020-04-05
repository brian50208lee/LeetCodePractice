package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P189_RotateArrayTest {
    @Test
    public void testRotateArray() {
        P189_RotateArray p189 = new P189_RotateArray();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int[] expected = new int[]{5,6,7,1,2,3,4};
        p189.rotate(nums, k);
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testRotateArray2() {
        P189_RotateArray p189 = new P189_RotateArray();
        int[] nums = new int[]{-1,-100,3,99};
        int k = 2;
        int[] expected = new int[]{3,99,-1,-100};
        p189.rotate(nums, k);
        Assert.assertArrayEquals(expected, nums);
    }
}