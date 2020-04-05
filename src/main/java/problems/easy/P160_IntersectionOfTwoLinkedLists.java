package problems.easy;

import problems.structure.ListNode;

public class P160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int sizeA = getSize(headA);
        int sizeB = getSize(headB);

        while (sizeA > sizeB) {
            headA = headA.next;
            sizeA--;
        }
        while (sizeA < sizeB) {
            headB = headB.next;
            sizeB--;
        }

        ListNode result = null;
        while (headA != null) {
            if (headA.val != headB.val) {
                result = null;
            } else {
                if (result == null) {
                    result = headA;
                }
            }
            headA = headA.next;
            headB = headB.next;
        }

        return result;
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
