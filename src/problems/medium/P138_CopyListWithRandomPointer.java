package problems.medium;

import problems.structure.RandomListNode;

import java.util.HashMap;
import java.util.Map;

public class P138_CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }

        RandomListNode dummyHead = new RandomListNode(0);
        Map<RandomListNode, RandomListNode> originToCopy = new HashMap<>();

        RandomListNode origin = head;
        RandomListNode copy = new RandomListNode(head.label);
        originToCopy.put(origin, copy);
        dummyHead.next = copy;
        while (origin != null) {
            if (origin.next != null) {
                copy.next = new RandomListNode(origin.next.label);
                originToCopy.put(origin.next, copy.next);
            }
            copy = copy.next;
            origin = origin.next;
        }

        origin = head;
        while (origin != null) {
            if (origin.random != null) {
                originToCopy.get(origin).random = originToCopy.get(origin.random);
            }
            origin = origin.next;
        }

        return dummyHead.next;
    }
}
