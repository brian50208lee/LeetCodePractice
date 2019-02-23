package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P131_PalindromePartitioningTest {
    @Test
    public void testPartition() {
        // given
        P131_PalindromePartitioning p131 = new P131_PalindromePartitioning();
        List<List<String >> expected = new ArrayList<>();
        expected.add(Arrays.asList("a", "a", "b"));
        expected.add(Arrays.asList("aa", "b"));
        //when

        //then
        Assert.assertEquals(expected, p131.partition("aab"));
    }
}