package problems.medium;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.TreeNode;

public class P230_KthSmallestElementInABSTTest {
    @Test
    public void testKthSmallest() {
        // given
        P230_KthSmallestElementInABST p230 = new P230_KthSmallestElementInABST();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        int k = 1;
        int expected = 1;

        //when
        //then
        Assert.assertEquals(expected, p230.kthSmallest(root, k));
    }

    @Test
    public void testKthSmallest2() {
        // given
        P230_KthSmallestElementInABST p230 = new P230_KthSmallestElementInABST();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        int k = 3;
        int expected = 3;

        //when
        //then
        Assert.assertEquals(expected, p230.kthSmallest(root, k));
    }
}