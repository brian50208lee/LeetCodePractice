package problems.medium;

import problems.structure.ListNode;

public class P2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode currNode = dummyHead;
        int carry = 0;
        while (notBothNull(l1, l2)) {
            int val1 = l1 != null ? l1.val: 0;
            int val2 = l2 != null ? l2.val: 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);
            currNode.next = newNode;
            currNode = newNode;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (carry != 0) {
            currNode.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    private boolean notBothNull(ListNode l1, ListNode l2) {
        return l1 != null || l2 != null;
    }
}
