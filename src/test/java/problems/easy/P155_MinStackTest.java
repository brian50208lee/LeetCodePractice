package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P155_MinStackTest {
    @Test
    public void testExample() {
        P155_MinStack minStack = new P155_MinStack();
        minStack.push(-2);
        minStack.push(-0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.getMin());
    }
}