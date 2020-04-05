package problems.medium;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P102_BInaryTreeLevelOrderTraversalTest {
    @Test
    public void testLevelOrder() {
        P102_BInaryTreeLevelOrderTraversal p102 = new P102_BInaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));

        Assert.assertEquals(expected, p102.levelOrder(root));
    }
}