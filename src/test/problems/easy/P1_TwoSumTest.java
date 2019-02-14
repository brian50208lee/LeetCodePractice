package problems.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P1_TwoSumTest {

    @Test
    public void testTwoSum() {
        // given
        final P1_TwoSum twoSumSolver = new P1_TwoSum();
        final int[] nums = {2, 7, 11, 15};
        final int target = 9;
        final int[] expectedResult = {0, 1};

        // when
        int[] result = twoSumSolver.twoSum(nums, target);
        Arrays.sort(expectedResult);
        Arrays.sort(result);

        // then
        Assert.assertArrayEquals(expectedResult, result);
    }
}