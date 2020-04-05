package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P162_FindPeakElementTest {
    @Test
    public void testFindPeakIndex() {
        P162_FindPeakElement p162 = new P162_FindPeakElement();
        Assert.assertEquals(2, p162.findPeakElement(new int[]{1,2,3,1}));
    }

    @Test
    public void testFindPeakIndex2() {
        P162_FindPeakElement p162 = new P162_FindPeakElement();
        int result = p162.findPeakElement(new int[]{1,2,1,3,5,6,4});
        Assert.assertTrue(result == 1 || result == 5);
    }
}