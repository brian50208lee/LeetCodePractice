package problems.medium;


import problems.structure.Node;

public class P116_PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node currentLevelHead = root;
        while (currentLevelHead != null) {
            Node node = currentLevelHead;
            while (node != null) {
                if (node.left != null) {
                    node.left.next = node.right;
                }
                if (node.right != null && node.next != null) {
                    node.right.next = node.next.left;
                }
                node = node.next;
            }
            currentLevelHead = currentLevelHead.left;
        }
        return root;
    }
}
