package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P384_ShuffleAnArrayTest {
    @Test
    public void testShuffle() {
        int[] nums = {1,2,3};
        P384_ShuffleAnArray obj = new P384_ShuffleAnArray(nums);

        int[] param_2 = obj.shuffle();
        Set<Integer> results = new HashSet<>();
        for (int i : param_2) {
            results.add(i);
        }
        Set<Integer> expectedSet = new HashSet(Arrays.asList(1,2,3));
        Assert.assertEquals(expectedSet.toString(), results.toString());

        int[] expected = {1,2,3};
        int[] param_1 = obj.reset();
        Assert.assertArrayEquals(expected, param_1);
    }
}