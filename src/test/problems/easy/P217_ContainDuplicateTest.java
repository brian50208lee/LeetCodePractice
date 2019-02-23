package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P217_ContainDuplicateTest {
    @Test
    public void testContainsDuplicate() {
        Assert.assertEquals(true, new P217_ContainDuplicate().containsDuplicate(new int []{1,2,3,1}));
        Assert.assertEquals(false, new P217_ContainDuplicate().containsDuplicate(new int []{1,2,3,4}));
        Assert.assertEquals(true, new P217_ContainDuplicate().containsDuplicate(new int []{1,1,1,3,3,4,3,2,4,2}));
    }
}