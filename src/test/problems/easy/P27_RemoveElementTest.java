package problems.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P27_RemoveElementTest {
    private P27_RemoveElement removeElementSolver = new P27_RemoveElement();
    private int[] nums;
    private int val;
    private int[] expectedResultArray;

    @Test
    public void testRemoveElement() {
        nums = new int[]{3,2,2,3};
        val = 3;
        expectedResultArray = new int[]{2, 2};
        runExample(nums, val, expectedResultArray);

        nums = new int[]{0,1,2,2,3,0,4,2};
        val = 2;
        expectedResultArray = new int[]{0, 1, 3, 0, 4};
        runExample(nums, val, expectedResultArray);
    }

    private void runExample(int[] nums, int val, int[] expectedResultArray) {
        int expectedResultSize = expectedResultArray.length;
        Assert.assertEquals(expectedResultSize, removeElementSolver.removeElement(nums, val));
        Assert.assertArrayEquals(expectedResultArray, Arrays.copyOfRange(nums, 0, expectedResultSize));
    }
}