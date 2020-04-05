package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P268_MissingNumberTest {
    @Test
    public void testMissingNumber() {
        P268_MissingNumber p268 = new P268_MissingNumber();
        Assert.assertEquals(2, p268.missingNumber(new int[]{3,0,1}));
    }

    @Test
    public void testMissingNumber2() {
        P268_MissingNumber p268 = new P268_MissingNumber();
        Assert.assertEquals(8, p268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    @Test
    public void testMissingNumberXOR() {
        P268_MissingNumber p268 = new P268_MissingNumber();
        Assert.assertEquals(2, p268.missingNumberXOR(new int[]{3,0,1}));
    }

    @Test
    public void testMissingNumberXOR2() {
        P268_MissingNumber p268 = new P268_MissingNumber();
        Assert.assertEquals(8, p268.missingNumberXOR(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}