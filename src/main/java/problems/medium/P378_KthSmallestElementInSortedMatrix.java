package problems.medium;

import java.util.PriorityQueue;
import java.util.Queue;

public class P378_KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return -1;
        }

        // peek is the smallest element
        Queue<Tuple> priorityQueue = new PriorityQueue<>();

        // push first column
        for (int i = 0; i < matrix[0].length; i++) {
            priorityQueue.offer(new Tuple(i, 0, matrix[i][0]));
        }

        for (int i = 1; i <= k - 1 ; i++) { // loop k - 1 time
            Tuple smallest = priorityQueue.poll();
            if (smallest.y + 1 < matrix[0].length) { // push right element in this row
                priorityQueue.offer(new Tuple(smallest.x, smallest.y + 1, matrix[smallest.x][smallest.y + 1]));
            }
        }

        return priorityQueue.peek().val;
    }

    private class Tuple implements Comparable<Tuple> {
        int x;
        int y;
        int val;

        private Tuple (int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Tuple o) {
            if (this.val <= o.val) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
