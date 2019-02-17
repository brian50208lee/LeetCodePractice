package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15_3SumTest {

    @Test
    public void testThreeSum() {
        // given
        P15_3Sum p15 = new P15_3Sum();
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(-1, -1, 2)));
        expected.add(new ArrayList<>(Arrays.asList(-1, 0 , 1)));

        //when
        List<List<Integer>> result = p15.threeSum(nums);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testTwoSum() {
        // given
        P15_3Sum p15 = new P15_3Sum();
        int[] nums = new int[]{1, 3, 3, 4, 4, 5, 5, 8};
        int target = 8;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(3, 5)));
        expected.add(new ArrayList<>(Arrays.asList(4, 4)));

        //when
        List<List<Integer>> result = p15.twoSum(nums, 0, nums.length - 1, target);

        //then
        Assert.assertEquals(expected, result);
    }

}