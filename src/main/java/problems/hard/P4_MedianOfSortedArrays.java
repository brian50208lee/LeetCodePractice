package problems.hard;

public class P4_MedianOfSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 != 0) {
            int k = n / 2 + 1;
            return findKth(nums1, nums2, 0, 0, k);
        } else {
            int k = n / 2;
            double m1 = findKth(nums1, nums2, 0, 0, k);
            double m2 = findKth(nums1, nums2, 0, 0, k + 1);
            return  (m1 + m2) / 2;
        }
    }

    /**
     * binary search to find the k-th value from two sorted arrays.
     * 1. select the (k/2)-th element from both arrays
     * 2. for the array has smaller selected element, remove first (k/2) elements
     * 3. update k and recursive do 1. and 2.
     * Time Complexity is O(log(m+n)), for each call we remove (k/2) elements.
     * remove (k/2), (k/4), (k/8), ...
     */
    public double findKth(int[] nums1, int[] nums2, int left1, int left2, int k) {
        if (left1 > nums1.length - 1) {
            return nums2[left2 + k - 1];
        }
        if (left2 > nums2.length - 1) {
            return nums1[left1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[left1], nums2[left2]);
        }

        int checkIndex1 = Math.min(left1 + k / 2 - 1, nums1.length - 1);
        int checkIndex2 = Math.min(left2 + k / 2 - 1, nums2.length - 1);
        if (nums1[checkIndex1] < nums2[checkIndex2]) {
            return findKth(nums1, nums2, checkIndex1 + 1, left2, k - (checkIndex1 - left1 + 1));
        } else {
            return findKth(nums1, nums2, left1, checkIndex2 + 1, k - (checkIndex2 - left2 + 1));
        }
    }
}
