package problems.easy;

import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P237_DeleteNodeInALinkedListTest {
    @Test
    public void testDelete() {
        // given
        P237_DeleteNodeInALinkedList p237 = new P237_DeleteNodeInALinkedList();

        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        ListNode expected = new ListNode(4);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(9);

        //when
        p237.deleteNode(head.next);

        //then
        ListNodeTest.assertLinkedListEquals(expected, head);
    }
}