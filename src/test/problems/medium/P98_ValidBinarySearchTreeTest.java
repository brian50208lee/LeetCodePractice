package problems.medium;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.TreeNode;

public class P98_ValidBinarySearchTreeTest {
    @Test
    public void testIsValidBST() {
        // given
        P98_ValidBinarySearchTree p98 = new P98_ValidBinarySearchTree();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        //when

        //then
        Assert.assertEquals(true, p98.isValidBST(root));
    }

    @Test
    public void testIsValidBST2() {
        // given
        P98_ValidBinarySearchTree p98 = new P98_ValidBinarySearchTree();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        //when

        //then
        Assert.assertEquals(false, p98.isValidBST(root));
    }

    @Test
    public void testIsValidBST3() {
        // given
        P98_ValidBinarySearchTree p98 = new P98_ValidBinarySearchTree();
        TreeNode root = new TreeNode(Integer.MAX_VALUE);

        //when

        //then
        Assert.assertEquals(true, p98.isValidBST(root));
    }
}