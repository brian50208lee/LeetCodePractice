package problems.medium;

import org.junit.Test;
import problems.structure.RandomListNode;
import problems.structure.RandomListNodeTest;

public class P138_CopyListWithRandomPointerTest {
    @Test
    public void testCopyRandomList() {
        // given
        P138_CopyListWithRandomPointer p138 = new P138_CopyListWithRandomPointer();
        RandomListNode head = new RandomListNode(5);
        head.next = new RandomListNode(3);
        head.next.next = new RandomListNode(-5);
        head.next.next.random = head;
        head.next.random = head.next.next;

        //when
        RandomListNode results = p138.copyRandomList(head);

        //then
        RandomListNodeTest.assertRandomListNodeEquals(head, results);
    }
}