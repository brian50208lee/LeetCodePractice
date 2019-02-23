package problems.easy;

import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P206_ReverseLinkedListTest {
    @Test
    public void testReverseList() {
        ListNode head = ListNodeTest.createLinkedListByArray(new int[]{1,2,3,4,5});
        ListNode expected = ListNodeTest.createLinkedListByArray(new int[]{5,4,3,2,1});
        ListNodeTest.assertLinkedListEquals(expected, new P206_ReverseLinkedList().reverseList(head));
    }
}