package problems.structure;

public class RandomListNode {
    public int label;
    public RandomListNode next;
    public RandomListNode random;

    public RandomListNode(int x) {
        this.label = x;
    }

    @Override
    public String toString() {
        String thisVal = label + "";
        String randomVal = random == null ? null : random.label + "";
        String str = String.format("(%s <%s>)", thisVal, randomVal);
        return next == null ? str : str + ", " + next;
    }
}
