package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

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
        List<List<Integer>> results = p78.subsets(nums);

        //then
        Set<String> expectedSet = new HashSet<>();
        for (List<Integer> integers : expected) {
            Collections.sort(integers);
            expectedSet.add(integers.toString());
        }
        Set<String> actualSet = new HashSet<>();
        for (List<Integer> integers : results) {
            Collections.sort(integers);
            actualSet.add(integers.toString());
        }
        Assert.assertEquals(expectedSet.toString(), actualSet.toString());
    }
}