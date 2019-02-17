package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P33_SeaechInRotatedSortedArrayTest {
    @Test
    public void testSearcgh() {
        // given
        P33_SeaechInRotatedSortedArray p33 = new P33_SeaechInRotatedSortedArray();

        //when

        //then
        Assert.assertEquals(4, p33.search(new int[]{4,5,6,7,0,1,2}, 0));
        Assert.assertEquals(-1, p33.search(new int[]{4,5,6,7,0,1,2}, 3));
    }
}