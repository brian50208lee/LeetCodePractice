package problems.medium;

import problems.structure.ListNode;

import java.util.HashMap;
import java.util.Map;

public class P19_RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        Map<Integer, ListNode> indexRecord = buildIndexRecord(head);
        removeNthNode(head, indexRecord, indexRecord.size() - n);

        return head;
    }

    private Map<Integer, ListNode> buildIndexRecord(ListNode head) {
        Map<Integer, ListNode> indexRecord = new HashMap<>();
        ListNode currentNode = head;
        int listSize = 0;
        while (currentNode != null) {
            indexRecord.put(listSize, currentNode);
            listSize++;
            currentNode = currentNode.next;
        }
        return indexRecord;
    }

    private void removeNthNode(ListNode head,  Map<Integer, ListNode> indexRecord, int n) {
        if (n == 0) {
            head = head.next;
        } else {
            ListNode previousNode = indexRecord.get(n - 1);
            previousNode.next = previousNode.next.next;
        }
    }
}
