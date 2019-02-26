package problems.medium;

import java.util.*;

public class P347_TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // calculate num frequency O(n)
        Map<Integer, Integer> numToFreq = new HashMap<>();
        for (int num : nums) {
            numToFreq.put(num, numToFreq.getOrDefault(num, 0) + 1);
        }

        // build frequency to numbers map O(n)
        Map<Integer, List<Integer>> freqToNums = new HashMap<>();
        for (Integer num : numToFreq.keySet()) {
            int freq = numToFreq.get(num);
            if (!freqToNums.containsKey(freq)) {
                freqToNums.put(freq, new ArrayList<>());
            }
            freqToNums.get(freq).add(num);
        }

        // sort frequency O(n log n)
        List<Integer> results = new ArrayList<>();
        Object[] sortedFreqs = freqToNums.keySet().toArray();
        Arrays.sort(sortedFreqs);

        // output top-k frequency number O(n)
        for (int i = sortedFreqs.length - 1; i >= 0 ; i--) {
            for (Integer integer : freqToNums.get(sortedFreqs[i])) {
                results.add(integer);
                if (results.size() == k) {
                    return results;
                }
            }
        }
        return null;
    }
}