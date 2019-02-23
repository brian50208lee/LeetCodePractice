package problems.medium;

import org.junit.Test;
import problems.structure.Node;
import problems.structure.NodeTest;

public class P116_PopulatingNextRightPointersInEachNodeTest {
    @Test
    public void testConnect() {
        // given
        P116_PopulatingNextRightPointersInEachNode p116 = new P116_PopulatingNextRightPointersInEachNode();
        Node root = new Node(1,
                new Node(2,
                        new Node(4, null, null, null),
                        new Node(5, null, null, null),
                        null
                        ),
                new Node(3,
                        new Node(6, null, null, null),
                        new Node(7, null, null, null),
                        null
                        ),
                null
        );

        Node expected = new Node(1,
                new Node(2,
                        new Node(4, null, null, null),
                        new Node(5, null, null, null),
                        null
                ),
                new Node(3,
                        new Node(6, null, null, null),
                        new Node(7, null, null, null),
                        null
                ),
                null
        );
        expected.left.next = expected.right;
        expected.left.left.next = expected.left.right;
        expected.left.right.next = expected.right.left;
        expected.right.left.next = expected.right.right;

        //when
        Node result = p116.connect(root);

        //then
        NodeTest.assertNodeEquals(expected, result);
    }
}