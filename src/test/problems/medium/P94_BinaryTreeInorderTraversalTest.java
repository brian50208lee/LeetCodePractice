package problems.medium;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.TreeNode;

import java.util.Arrays;

public class P94_BinaryTreeInorderTraversalTest {
    @Test
    public void testInorderTraversal() {
        // given
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        //when

        //then
        Assert.assertEquals(Arrays.asList(1,3,2), new P94_BinaryTreeInorderTraversal().inorderTraversal(root));
    }
}