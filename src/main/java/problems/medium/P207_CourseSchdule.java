package problems.medium;


import java.util.*;

public class P207_CourseSchdule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }

        // create DAG
        Map<Integer, List<Integer>> dag = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            if (!dag.containsKey(prerequisite[0])) {
                dag.put(prerequisite[0], new ArrayList<>());
            }
            dag.get(prerequisite[0]).add(prerequisite[1]);
        }

        return isCyclic(numCourses, dag);
    }

    // TODO awesome utility
    private boolean isCyclic(int numberOfNodes, Map<Integer, List<Integer>> dag) {
        boolean[] records = new boolean[numberOfNodes];
        boolean[] visited = new boolean[numberOfNodes]; // pruning
        for (int i = 0; i < numberOfNodes; i++) {
            if (isCyclic(i, dag, records, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCyclic(int start, Map<Integer, List<Integer>> dag, boolean[] records, boolean[] visited) {
        if (visited[start]) { // pruning
            return false;
        }
        if (records[start]) {
            return true;
        }

        records[start] = true;
        if (dag.containsKey(start)) {
            List<Integer> nexts = dag.get(start);
            for (Integer next : nexts) {
                if (isCyclic(next, dag, records, visited)) {
                    return true;
                }
            }
        }
        records[start] = false;

        visited[start] = true;
        return false;
    }
}
