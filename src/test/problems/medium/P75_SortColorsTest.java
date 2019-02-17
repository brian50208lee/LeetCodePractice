package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P75_SortColorsTest {
    @Test
    public void testSortColors() {
        // given
        P75_SortColors p75 = new P75_SortColors();
        int[] nums = new int[]{2,0,2,1,1,0};
        int[] expected = new int[]{0,0,1,1,2,2};

        //when
        p75.sortColors(nums);

        //then
        Assert.assertArrayEquals(expected, nums);
    }
}