package problems.medium;

import org.junit.Test;
import problems.structure.TreeNode;
import problems.structure.TreeNodeTest;

public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    @Test
    public void testBuildTree() {
        // given
        P105_ConstructBinaryTreeFromPreorderAndInorderTraversal p105 = new P105_ConstructBinaryTreeFromPreorderAndInorderTraversal();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode expected = new TreeNode(3);
        expected.left = new TreeNode(9);
        expected.right = new TreeNode(20);
        expected.right.left = new TreeNode(15);
        expected.right.right = new TreeNode(7);

        //when
        TreeNode result = p105.buildTree(preorder, inorder);

        // Then
        TreeNodeTest.assertTreeEquals(expected, result);
    }
}