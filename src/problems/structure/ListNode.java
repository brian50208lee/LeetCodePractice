package problems.structure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public String toString() {
        if (this.next == null) {
            return Integer.toString(this.val);
        }
        return Integer.toString(this.val) + ", " + this.next.toString();
    }
}
