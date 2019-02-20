package problems.structure;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeTest {
    @Test
    public void testTreeEquals() {
        // given
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);

        assertTreeEquals(root1, root2);
    }

    public static void assertTreeEquals(TreeNode expected, TreeNode actual) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(expected);
        queue.offer(actual);

        while (!queue.isEmpty()) {
            TreeNode leftTree = queue.poll();
            TreeNode rightTree = queue.poll();
            if (leftTree != null) {
                Assert.assertEquals(leftTree.val, rightTree.val);
            } else {
                Assert.assertEquals(null, rightTree);
            }
            if (leftTree != null) {
                queue.offer(leftTree.left);
                queue.offer(rightTree.left);
                queue.offer(leftTree.right);
                queue.offer(rightTree.right);
            }
        }
    }
}