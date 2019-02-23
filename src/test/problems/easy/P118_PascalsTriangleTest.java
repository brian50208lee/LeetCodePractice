package problems.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P118_PascalsTriangleTest {
    @Test
    public void testGenerate() {
        // given
        P118_PascalsTriangle p118 = new P118_PascalsTriangle();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1,1));
        expected.add(Arrays.asList(1,2,1));
        expected.add(Arrays.asList(1,3,3,1));
        expected.add(Arrays.asList(1,4,6,4,1));

        //when

        //then
        Assert.assertEquals(expected, p118.generate(5));
    }
}