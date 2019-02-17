package problems.easy;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.TreeNode;

public class P100_SameTreeTest {
    P100_SameTree sameTreeSolver = new P100_SameTree();

    @Test
    public void testIsSameTree() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        boolean expected = true;

        //when
        boolean result = sameTreeSolver.isSameTree(root1, root2);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testIsSameTree2() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        boolean expected = false;

        //when
        boolean result = sameTreeSolver.isSameTree(root1, root2);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testIsSameTree3() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);

        boolean expected = false;

        //when
        boolean result = sameTreeSolver.isSameTree(root1, root2);

        //then
        Assert.assertEquals(expected, result);
    }

}