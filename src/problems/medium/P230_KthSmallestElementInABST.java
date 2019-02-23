package problems.medium;

import problems.structure.TreeNode;

import java.util.Stack;

public class P230_KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        // DFS
        int count = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            // inorder
            if (++count == k) {
                return node.val;
            }

            TreeNode rightNode = node.right;
            while (rightNode != null) {
                stack.push(rightNode);
                rightNode = rightNode.left;
            }
        }

        return 0;
    }
}
