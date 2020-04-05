package problems.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P26_RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() {
        // given
        P26_RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArraySolver = new P26_RemoveDuplicatesFromSortedArray();
        int[] input1 = new int[]{1, 1, 2};
        int[] input2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int[] expectedResultArray1 = new int[]{1, 2};
        int[] expectedResultArray2 = new int[]{0, 1, 2, 3, 4};

        int expectedResultSize1 = 2;
        int expectedResultSize2 = 5;

        //when

        //then
        Assert.assertEquals(expectedResultSize1, removeDuplicatesFromSortedArraySolver.removeDuplicates(input1));
        Assert.assertEquals(expectedResultSize2, removeDuplicatesFromSortedArraySolver.removeDuplicates(input2));
        Assert.assertArrayEquals(expectedResultArray1, Arrays.copyOfRange(input1, 0, expectedResultSize1));
        Assert.assertArrayEquals(expectedResultArray2, Arrays.copyOfRange(input2, 0, expectedResultSize2));
    }
}