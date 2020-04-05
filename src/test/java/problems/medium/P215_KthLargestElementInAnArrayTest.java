package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P215_KthLargestElementInAnArrayTest {
    @Test
    public void testFindKthLargest() {
        P215_KthLargestElementInAnArray p215 = new P215_KthLargestElementInAnArray();
        Assert.assertEquals(5, p215.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }

    @Test
    public void testFindKthLargest2() {
        P215_KthLargestElementInAnArray p215 = new P215_KthLargestElementInAnArray();
        Assert.assertEquals(4, p215.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}