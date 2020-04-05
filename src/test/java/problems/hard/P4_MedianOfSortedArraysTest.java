package problems.hard;

import org.junit.Assert;
import org.junit.Test;

public class P4_MedianOfSortedArraysTest {
    @Test
    public void testFindMedianSortedArrays() {
        // given
        P4_MedianOfSortedArrays p4 = new P4_MedianOfSortedArrays();
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};

        //when
        
        //then
        Assert.assertEquals(2.0, p4.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    public void testFindMedianSortedArrays2() {
        // given
        P4_MedianOfSortedArrays p4 = new P4_MedianOfSortedArrays();
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};

        //when

        //then
        Assert.assertEquals(2.5, p4.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    public void testFindMedianSortedArrays3() {
        // given
        P4_MedianOfSortedArrays p4 = new P4_MedianOfSortedArrays();
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1};

        //when

        //then
        Assert.assertEquals(1.0, p4.findMedianSortedArrays(nums1, nums2), 0.00001);
    }
}