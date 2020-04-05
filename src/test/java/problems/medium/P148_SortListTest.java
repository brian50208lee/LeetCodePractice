package problems.medium;

import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P148_SortListTest {
    @Test
    public void test() {
        // given
        P148_SortList p148 = new P148_SortList();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);

        //when

        //then
        ListNodeTest.assertLinkedListEquals(expected, p148.sortList(head));
    }

    @Test
    public void test2() {
        // given
        P148_SortList p148 = new P148_SortList();
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);

        ListNode expected = new ListNode(-1);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);

        //when

        //then
        ListNodeTest.assertLinkedListEquals(expected, p148.sortList(head));
    }
}