package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P347_TopKFrequentElementsTest {
    @Test
    public void testTopK() {
        // given
        P347_TopKFrequentElements p347 = new P347_TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        List<Integer> expected = Arrays.asList(1,2);

        //when
        List<Integer> results = p347.topKFrequent(nums, k);

        //then
        Assert.assertEquals(expected.toString(), results.toString());
    }

    @Test
    public void testTopK2() {
        // given
        P347_TopKFrequentElements p347 = new P347_TopKFrequentElements();
        int[] nums = {1};
        int k = 1;
        List<Integer> expected = Arrays.asList(1);

        //when
        List<Integer> results = p347.topKFrequent(nums, k);

        //then
        Assert.assertEquals(expected.toString(), results.toString());
    }
}