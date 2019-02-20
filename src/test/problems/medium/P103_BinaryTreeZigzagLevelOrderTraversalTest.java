package problems.medium;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P103_BinaryTreeZigzagLevelOrderTraversalTest {
    @Test
    public void testZigzagLevelOrder() {
        // given
        P103_BinaryTreeZigzagLevelOrderTraversal p103 = new P103_BinaryTreeZigzagLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(20, 9));
        expected.add(Arrays.asList(15, 7));

        //when

        //then
        Assert.assertEquals(expected, p103.zigzagLevelOrder(root));
    }
}