package problems.medium;

import java.util.HashMap;
import java.util.Map;

public class P454_4SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> negativeSumCount = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int negativeSum = -(a+b);
                negativeSumCount.put(negativeSum, negativeSumCount.getOrDefault(negativeSum, 0) + 1);
            }
        }

        int result = 0;
        for (int c : C) {
            for (int d : D) {
                int sum = c + d;
                if (negativeSumCount.containsKey(sum)) {
                    result += negativeSumCount.get(sum);
                }
            }
        }

        return result;
    }
}
