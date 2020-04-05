package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P283_MoveZeroesTest {
    @Test
    public void testMoveZeroes() {
        // given
        P283_MoveZeroes p283 = new P283_MoveZeroes();
        int[] nums = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};

        //when
        p283.moveZeroes(nums);

        //then
        Assert.assertArrayEquals(expected, nums);
    }
}