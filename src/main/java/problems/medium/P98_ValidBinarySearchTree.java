package problems.medium;

import problems.structure.TreeNode;

public class P98_ValidBinarySearchTree {

    // TODO awesome
    public boolean isValidBST(TreeNode root) {
        return recursive(root, null, null);
    }

    /**
     * root's value should always in interval (min, max)
     */
    public boolean recursive(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        boolean outLeftBound = min != null && root.val <= min;  // can not be equal
        boolean outRightBound = max != null && root.val >= max;

        if (outLeftBound || outRightBound) {
            return false;
        }

        return recursive(root.left, min, root.val) && recursive(root.right, root.val, max);
    }
}
