package problems.easy;

public class P88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndexOfNums1 = m - 1;
        int lastIndexOfNums2 = n - 1;
        int lastResultIndex = m + n - 1;

        while (lastIndexOfNums1 >= 0 && lastIndexOfNums2 >= 0) {
            if (nums1[lastIndexOfNums1] > nums2[lastIndexOfNums2]) {
                nums1[lastResultIndex] = nums1[lastIndexOfNums1];
                lastIndexOfNums1--;
                lastResultIndex--;
            } else {
                nums1[lastResultIndex] = nums2[lastIndexOfNums2];
                lastIndexOfNums2--;
                lastResultIndex--;
            }
        }

        while (lastIndexOfNums2 >= 0) {
            nums1[lastResultIndex] = nums2[lastIndexOfNums2];
            lastIndexOfNums2--;
            lastResultIndex--;
        }
    }
}
