package problems.easy;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.TreeNode;

public class P104_MaximumDepthOfBinaryTreeTest {
    @Test
    public void testMaxDepth() {
        // given
        P104_MaximumDepthOfBinaryTree p104 = new P104_MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int expected = 3;
        //when

        //then
        Assert.assertEquals(expected, p104.maxDepth(root));
    }
}