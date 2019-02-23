package problems.structure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public String toString() {
        String thisVal = val + "";
        return next == null ? thisVal : thisVal + ", " + next.toString();
    }
}
