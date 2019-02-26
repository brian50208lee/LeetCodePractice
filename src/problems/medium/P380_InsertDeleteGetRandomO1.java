package problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class P380_InsertDeleteGetRandomO1 {
    private Map<Integer, Integer> valueToIndex;
    private Map<Integer, Integer> indexToValue;
    private Random random;

    /** Initialize your data structure here. */
    public P380_InsertDeleteGetRandomO1() {
        valueToIndex = new HashMap<>();
        indexToValue = new HashMap<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (valueToIndex.containsKey(val)) {
            return false;
        } else {
            int index = valueToIndex.size();
            valueToIndex.put(val, index);
            indexToValue.put(index, val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!valueToIndex.containsKey(val)) {
            return false;
        } else {
            int index = valueToIndex.get(val);
            int lastIndex = valueToIndex.size() - 1;
            int lastValue = indexToValue.get(lastIndex);
            valueToIndex.remove(val);
            indexToValue.remove(index); // slot index

            if (index != lastIndex && valueToIndex.size() > 0) { // move last to the slot index
                valueToIndex.remove(lastValue);
                indexToValue.remove(lastIndex);
                valueToIndex.put(lastValue, index);
                indexToValue.put(index, lastValue);
            }
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int index = random.nextInt(indexToValue.size());
        return indexToValue.get(index);
    }
}
