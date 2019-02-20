package problems.easy;

import org.junit.Test;
import problems.structure.TreeNode;
import problems.structure.TreeNodeTest;

public class P108_ConvertSortedArrayToBinarySearchTreeTest {
    @Test
    public void testToBST() {
        // given
        P108_ConvertSortedArrayToBinarySearchTree p108 = new P108_ConvertSortedArrayToBinarySearchTree();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(-10);
        expected.left.right = new TreeNode(-3);
        expected.right = new TreeNode(5);
        expected.right.right = new TreeNode(9);

        //when
        TreeNode result = p108.sortedArrayToBST(nums);

        //then
        TreeNodeTest.assertTreeEquals(expected, result);
    }
}