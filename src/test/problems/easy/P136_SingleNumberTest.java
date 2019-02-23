package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P136_SingleNumberTest {
    @Test
    public void testSingleNumber() {
        P136_SingleNumber p136 = new P136_SingleNumber();
        Assert.assertEquals(1, p136.singleNumber(new int[]{2,2,1}));
    }

    @Test
    public void testSingleNumber2() {
        P136_SingleNumber p136 = new P136_SingleNumber();
        Assert.assertEquals(4, p136.singleNumber(new int[]{4,1,2,1,2}));
    }

    @Test
    public void testSingleNumberXOR() {
        P136_SingleNumber p136 = new P136_SingleNumber();
        Assert.assertEquals(1, p136.singleNumberXOR(new int[]{2,2,1}));
    }

    @Test
    public void testSingleNumberXOR2() {
        P136_SingleNumber p136 = new P136_SingleNumber();
        Assert.assertEquals(4, p136.singleNumberXOR(new int[]{4,1,2,1,2}));
    }
}