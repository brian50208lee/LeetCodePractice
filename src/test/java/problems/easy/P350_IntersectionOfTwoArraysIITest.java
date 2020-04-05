package problems.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P350_IntersectionOfTwoArraysIITest {
    @Test
    public void testIntersectionOfTwoArrays() {
        // given
        P350_IntersectionOfTwoArraysII p350 = new P350_IntersectionOfTwoArraysII();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] expected = {2,2};

        //when
        int[] result = p350.intersect(nums1, nums2);

        //then
        Arrays.sort(expected);
        Arrays.sort(result);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testIntersectionOfTwoArrays2() {
        // given
        P350_IntersectionOfTwoArraysII p350 = new P350_IntersectionOfTwoArraysII();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] expected = {4,9};

        //when
        int[] result = p350.intersect(nums1, nums2);

        //then
        Arrays.sort(expected);
        Arrays.sort(result);
        Assert.assertArrayEquals(expected, result);
    }
}