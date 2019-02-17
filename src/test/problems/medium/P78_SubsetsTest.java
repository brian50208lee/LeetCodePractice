package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P78_SubsetsTest {
    @Test
    public void testSubsets() {
        // given
        P78_Subsets p78 = new P78_Subsets();
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1,2,3));
        expected.add(Arrays.asList(1,3));
        expected.add(Arrays.asList(2,3));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList());

        //when

        //then
        Assert.assertEquals(expected.toString(), p78.subsets(nums).toString());
    }
}