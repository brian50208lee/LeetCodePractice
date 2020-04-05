package problems.easy;

import problems.structure.ListNode;

public class P206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode previous = null;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        head.next = previous;
        return head;
    }
}
