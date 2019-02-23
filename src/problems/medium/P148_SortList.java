package problems.medium;

import problems.structure.ListNode;

public class P148_SortList {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        int size = getSize(head);
        if (size == 1) {
            return head;
        }

        ListNode left = head;
        ListNode right = head;
        for (int i = 0; i < size / 2 - 1; i++) {
            right = right.next;
        }

        ListNode previous = right;
        right = right.next;
        previous.next = null;
        //System.out.println("left = " + left);
        //System.out.println("right = " + right);
        ListNode leftResult = mergeSort(left);
        ListNode rightResult = mergeSort(right);
        return merge(leftResult, rightResult);
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode sortedHead = dummyHead;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                sortedHead.next = head1;
                head1 = head1.next;
            } else {
                sortedHead.next = head2;
                head2 = head2.next;
            }
            sortedHead = sortedHead.next;
        }

        if (head1 != null) {
            sortedHead.next = head1;
        } else {
            sortedHead.next = head2;
        }

        return dummyHead.next;
    }

    private int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    // TODO this is to slow
    private ListNode insertionSort(ListNode head) {
        ListNode sortedHead = head;
        ListNode unSortedHead = head.next;
        sortedHead.next = null;
        while (unSortedHead != null) {
            //System.out.println("sortedHead = " + sortedHead);
            //System.out.println("unSortedHead = " + unSortedHead);
            // remove connect
            ListNode currentNode = unSortedHead;
            unSortedHead = unSortedHead.next;
            currentNode.next = null;

            // insert
            if (currentNode.val < sortedHead.val) {
                currentNode.next = sortedHead;
                sortedHead = currentNode;
            } else {
                ListNode sorted = sortedHead;
                while (sorted != null && sorted.next != null) {
                    if (currentNode.val <= sorted.next.val) {
                        currentNode.next = sorted.next;
                        sorted.next = currentNode;
                        break;
                    }
                    sorted = sorted.next;
                }
                sorted.next = currentNode;
            }

        }
        return sortedHead;
    }
}
