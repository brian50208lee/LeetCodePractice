package problems.medium;

import problems.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P94_BinaryTreeInorderTraversal {
    private List<Integer> results = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        recursive(root);
        return results;
    }

    public void recursive(TreeNode node) {
        if (node == null) {
            return;
        }

        recursive(node.left);
        results.add(node.val);
        recursive(node.right);
    }
}
