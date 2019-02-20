package problems.medium;

import problems.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P103_BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);

        boolean reverse = false;
        while (!level.isEmpty()) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            List<Integer> tmpResult = new ArrayList<>();
            for (TreeNode treeNode : level) {
                if (reverse) {
                    tmpResult.add(0, treeNode.val);
                } else {
                    tmpResult.add(treeNode.val);
                }
                if (treeNode.left != null) {
                    nextLevel.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    nextLevel.offer(treeNode.right);
                }
            }
            results.add(tmpResult);
            level = nextLevel;
            reverse = ! reverse;
        }


        return results;
    }
}
