package problems.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P46_PermutationsTest {
    private P46_Permutations p46;
    int[] intput;
    List<List<Integer>> expected;

    @Before
    public void setUp() throws Exception {
        p46 = new P46_Permutations();
        intput = new int[]{1,2,3};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(3,2,1));
        expected.add(Arrays.asList(2,3,1));
        expected.add(Arrays.asList(2,1,3));
        expected.add(Arrays.asList(3,1,2));
        expected.add(Arrays.asList(1,3,2));
        expected.add(Arrays.asList(1,2,3));
    }

    @Test
    public void testPermutationsLoop() {
        Assert.assertEquals(expected.toString(), p46.permuteLoop(intput).toString());
    }

    @Test
    public void testPermutationsSwap() {
        Assert.assertEquals(expected.toString(), p46.permuteSwap(intput).toString());
    }
}