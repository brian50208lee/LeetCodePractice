package problems.medium;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.TreeNode;

public class P236_LowestCommonAncestorOfABinaryTreeTest {
    @Test
    public void testLowestCommonAncestor() {
        // given
        P236_LowestCommonAncestorOfABinaryTree p236 = new P236_LowestCommonAncestorOfABinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;
        TreeNode q = root.right;

        TreeNode expected = root;

        //when
        TreeNode result = p236.lowestCommonAncestor(root, p, q);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testLowestCommonAncestor2() {
        // given
        P236_LowestCommonAncestorOfABinaryTree p236 = new P236_LowestCommonAncestorOfABinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;
        TreeNode q = root.left.right.right;

        TreeNode expected = root.left;

        //when
        TreeNode result = p236.lowestCommonAncestor(root, p, q);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testLowestCommonAncestor3() {
        // given
        P236_LowestCommonAncestorOfABinaryTree p236 = new P236_LowestCommonAncestorOfABinaryTree();
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(1);
        root.left.left.left = new TreeNode(2);
        root.left.left.left.left = new TreeNode(3);

        TreeNode p = root.left.left.left;
        TreeNode q = root.left.left.left.left;

        TreeNode expected = root.left.left.left;

        //when
        TreeNode result = p236.lowestCommonAncestor(root, p, q);

        //then
        Assert.assertEquals(expected, result);
    }
}