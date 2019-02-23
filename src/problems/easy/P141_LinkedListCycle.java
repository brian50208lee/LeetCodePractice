package problems.easy;

import problems.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

public class P141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head.next;
        while (head != null && fast != null && fast.next != null) {
            if (head == fast) {
                return true;
            }
            head = head.next;
            fast = fast.next.next;
        }
        return false;
    }

    public boolean hasCycleSet(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
