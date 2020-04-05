package problems.easy;


import problems.structure.TreeNode;

public class P100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }

        return isSameValue(p, q) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    private boolean isSameValue(TreeNode p, TreeNode q) {
        return p.val == q.val;
    }
}
