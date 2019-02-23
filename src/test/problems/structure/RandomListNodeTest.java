package problems.structure;

import org.junit.Assert;
import org.junit.Test;

public class RandomListNodeTest {

    @Test
    public void testToString() {
        // given
        RandomListNode head = new RandomListNode(10);
        head.next = new RandomListNode(5);
        head.next.next = new RandomListNode(3);
        head.next.next.random = head;
        String expected = "(10 <null>), (5 <null>), (3 <10>)";
        //when

        //then
        Assert.assertEquals(expected, head.toString());
    }

    public static void assertRandomListNodeEquals(RandomListNode node1, RandomListNode node2) {
        Assert.assertEquals(node1.toString(), node2.toString());
    }
}