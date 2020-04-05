package problems.medium;

import java.util.*;

public class P210_CourseScheduleII {
    private static final int[] IMPOSIBLE = new int[]{};

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) {
            return IMPOSIBLE;
        }

        Map<Integer, List<Integer>> dag = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            int required = prerequisite[1];
            int course = prerequisite[0];
            if (!dag.containsKey(required)) {
                dag.put(required, new ArrayList<>());
            }
            dag.get(required).add(course);
        }

        return topologySort(numCourses, dag);
    }

    // TODO topology sort for dag
    private int[] topologySort(int numberOfNode, Map<Integer, List<Integer>> dag) {
        int[] referencedCount = new int[numberOfNode];
        for (int i = 0; i < numberOfNode; i++) {
            if (dag.containsKey(i)) {
                for (Integer neighbord : dag.get(i)) {
                    referencedCount[neighbord]++;
                }
            }
        }

        int[] order = new int[numberOfNode];
        for (int i = 0; i < numberOfNode; i++) {
            int node = findNoReferenced(referencedCount);
            if (node == -1) {
                return IMPOSIBLE;
            }
            order[i] = node;
            referencedCount[node] = -1;

            if (dag.containsKey(node)) {
                for (Integer neighbord : dag.get(node)) {
                    referencedCount[neighbord]--;
                }
            }
        }
        return order;
    }

    private int findNoReferenced(int[] referencedCount) {
        for (int i = 0; i < referencedCount.length; i++) {
            if (referencedCount[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
