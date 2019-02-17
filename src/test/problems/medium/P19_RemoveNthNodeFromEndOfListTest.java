package problems.medium;

import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P19_RemoveNthNodeFromEndOfListTest {
    @Test
    public void testRemoveNthFromEnd() {
        // given
        P19_RemoveNthNodeFromEndOfList p19 = new P19_RemoveNthNodeFromEndOfList();
        ListNode head = ListNodeTest.createLinkedListByArray(new int[]{1, 2, 3, 4, 5});
        int n = 2;
        ListNode expected = ListNodeTest.createLinkedListByArray(new int[]{1, 2, 3, 5});

        //when
        ListNode result = p19.removeNthFromEnd(head, n);

        //then
        ListNodeTest.assertLinkedListEquals(expected, result);
    }
}