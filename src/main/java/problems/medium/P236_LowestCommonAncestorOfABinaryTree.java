package problems.medium;

import problems.structure.TreeNode;

public class P236_LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) { // found
            return root;
        } else if (left == null && right == null){
            return null;
        } else {
            return left == null ? right : left;
        }
    }
}
