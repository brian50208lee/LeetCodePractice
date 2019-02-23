package problems.structure;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class NodeTest {

    @Test
    public void testTreeEquals() {
        // given
        Node root1 = new Node(3, null, null, null);
        root1.left = new Node(3, null, null, null);
        root1.right = new Node(20, null, null, null);
        root1.right.left = new Node(15, null, null, null);
        root1.right.right = new Node(7, null, null, null);
        root1.left.next = root1.right;
        root1.right.left.next = root1.right.right;

        Node root2 = new Node(3, null, null, null);
        root2.left = new Node(3, null, null, null);
        root2.right = new Node(20, null, null, null);
        root2.right.left = new Node(15, null, null, null);
        root2.right.right = new Node(7, null, null, null);
        root2.left.next = root2.right;
        root2.right.left.next = root2.right.right;

        assertNodeEquals(root1, root2);
    }

    public static void assertNodeEquals(Node expected, Node actual) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(expected);
        queue.offer(actual);

        while (!queue.isEmpty()) {
            Node leftTree = queue.poll();
            Node rightTree = queue.poll();
            if (leftTree != null) {
                Assert.assertNotNull(rightTree);
                Assert.assertEquals(leftTree.val, rightTree.val);
            } else {
                Assert.assertNull(rightTree);
            }
            if (leftTree != null) {
                queue.offer(leftTree.next);
                queue.offer(rightTree.next);
                queue.offer(leftTree.left);
                queue.offer(rightTree.left);
                queue.offer(leftTree.right);
                queue.offer(rightTree.right);
            }
        }
    }
}