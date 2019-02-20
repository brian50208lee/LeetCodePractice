package problems.medium;

import problems.structure.TreeNode;

import java.util.Arrays;

public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int rootIndexInInorder = findRootIndexInInorderArray(inorder, root.val);
        int leftSize = rootIndexInInorder;
        int rightSize = inorder.length - rootIndexInInorder - 1;
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1+leftSize), Arrays.copyOfRange(inorder, 0, leftSize));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1+leftSize, preorder.length), Arrays.copyOfRange(inorder, leftSize+1, inorder.length));

        return root;
    }

    private int findRootIndexInInorderArray(int[] inorder, int val) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
