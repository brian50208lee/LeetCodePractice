package problems.medium;

import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P328_OddEvenLinkedListTest {
    @Test
    public void testOddEvenList() {
        // given
        P328_OddEvenLinkedList p328 = new P328_OddEvenLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(5);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(4);

        //when
        ListNode result = p328.oddEvenList(head);

        //then
        ListNodeTest.assertLinkedListEquals(expected, result);
    }

    @Test
    public void testOddEvenList2() {
        // given
        P328_OddEvenLinkedList p328 = new P328_OddEvenLinkedList();
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode expected = new ListNode(2);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(6);
        expected.next.next.next = new ListNode(7);
        expected.next.next.next.next = new ListNode(1);
        expected.next.next.next.next.next = new ListNode(5);
        expected.next.next.next.next.next.next = new ListNode(4);

        //when
        ListNode result = p328.oddEvenList(head);

        //then
        ListNodeTest.assertLinkedListEquals(expected, result);
    }
}