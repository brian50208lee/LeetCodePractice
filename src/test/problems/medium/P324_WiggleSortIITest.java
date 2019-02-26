package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P324_WiggleSortIITest {
    @Test
    public void testWiggleSort() {
        // given
        P324_WiggleSortII p324 = new P324_WiggleSortII();
        int[] nums = {1,5,1,1,6,4};

        //when
        p324.wiggleSort(nums);

        //then
        assertValidWiggle(nums);
    }

    @Test
    public void testWiggleSort2() {
        // given
        P324_WiggleSortII p324 = new P324_WiggleSortII();
        int[] nums = {4,5,5,6};

        //when
        p324.wiggleSort(nums);

        //then
        assertValidWiggle(nums);
    }

    private void assertValidWiggle(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        Assert.assertTrue(nums[0] < nums[1]);
        for (int i = 1; i < nums.length - 1; i++) {
            boolean isEven = i % 2 == 0;
            if (isEven) {
                Assert.assertTrue(nums[i] < nums[i-1]);
                Assert.assertTrue(nums[i] < nums[i+1]);
            } else {
                Assert.assertTrue(nums[i] > nums[i-1]);
                Assert.assertTrue(nums[i] > nums[i+1]);
            }
        }
        if ((nums.length - 1) % 2 == 0) {
            Assert.assertTrue(nums[nums.length - 1] < nums[nums.length - 2]);
        } else {
            Assert.assertTrue(nums[nums.length - 1] > nums[nums.length - 2]);
        }
    }
}