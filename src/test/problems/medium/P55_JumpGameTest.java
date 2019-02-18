package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P55_JumpGameTest {
    @Test
    public void testCanJump() {
        // given
        P55_JumpGame p55 = new P55_JumpGame();

        //when

        //then
        Assert.assertEquals(true, p55.canJump(new int[]{2,3,1,1,4}));
        Assert.assertEquals(false, p55.canJump(new int[]{3,2,1,0,4}));
    }
}