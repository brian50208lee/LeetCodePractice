package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P287_FindTheDuplicateNumberTest {
    @Test
    public void testFindDuplicate() {
        P287_FindTheDuplicateNumber p287 = new P287_FindTheDuplicateNumber();
        Assert.assertEquals(2, p287.findDuplicate(new int[]{1,3,4,2,2}));
    }

    @Test
    public void testFindDuplicate2() {
        P287_FindTheDuplicateNumber p287 = new P287_FindTheDuplicateNumber();
        Assert.assertEquals(3, p287.findDuplicate(new int[]{3,1,3,4,2}));
    }


    @Test
    public void testFindDuplicate3() {
        P287_FindTheDuplicateNumber p287 = new P287_FindTheDuplicateNumber();
        Assert.assertEquals(4, p287.findDuplicate(new int[]{1,4,4,2,4}));
    }
}