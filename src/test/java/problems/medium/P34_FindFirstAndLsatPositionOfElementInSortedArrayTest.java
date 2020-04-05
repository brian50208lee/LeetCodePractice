package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P34_FindFirstAndLsatPositionOfElementInSortedArrayTest {
    @Test
    public void testSearchRange() {
        // given
        P34_FindFirstAndLsatPositionOfElementInSortedArray p34 = new P34_FindFirstAndLsatPositionOfElementInSortedArray();

        //when

        //then
        Assert.assertArrayEquals(new int[]{3,4}, p34.searchRange(new int[]{5,7,7,8,8,10}, 8));
        Assert.assertArrayEquals(new int[]{-1,-1}, p34.searchRange(new int[]{5,7,7,8,8,10}, 6));
    }
}