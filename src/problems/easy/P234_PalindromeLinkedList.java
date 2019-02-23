package problems.easy;

import problems.structure.ListNode;

public class P234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        int size = getSize(head);
        if (size == 1) {
            return true;
        }

        ListNode rightHead = head;
        for (int i = 0; i < size / 2; i++) {
            rightHead = rightHead.next;
        }

        ListNode previous = null;
        while (rightHead != null) {
            ListNode tmpNext = rightHead.next;
            rightHead.next = previous;
            previous = rightHead;
            rightHead = tmpNext;
        }
        rightHead = previous;

        for (int i = 0; i < size / 2; i++) {
            if (head.val != rightHead.val) {
                return false;
            }
            head = head.next;
            rightHead = rightHead.next;
        }

        return true;
    }

    private int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}
