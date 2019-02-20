package problems.easy;

import org.junit.Assert;
import org.junit.Test;
import problems.easy.P101_SymmetricTree;
import problems.structure.TreeNode;

public class P101_SymmetricTreeTest {
    @Test
    public void testIsSymmetricTrue() {
        // given
        P101_SymmetricTree p101 = new P101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        //when

        //then
        Assert.assertEquals(true, p101.isSymmetric(root));
    }

    @Test
    public void testIsSymmetricFalse() {
        // given
        P101_SymmetricTree p101 = new P101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        //when

        //then
        Assert.assertEquals(false, p101.isSymmetric(root));
    }
}