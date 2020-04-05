package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P88_MergeSortedArrayTest {
    @Test
    public void testMerge() {
        // given
        P88_MergeSortedArray mergeSortedArraySolver = new P88_MergeSortedArray();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        int[] expectedOutput = new int[]{1, 2, 2, 3, 5, 6};

        //when
        mergeSortedArraySolver.merge(nums1, m, nums2, n);

        //then
        Assert.assertArrayEquals(expectedOutput, nums1);
    }
}