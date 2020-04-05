package problems.medium;

import java.util.Random;

public class P384_ShuffleAnArray {
    private int[] nums;
    private Random random;

    public P384_ShuffleAnArray(int[] nums) {
        this.nums = nums.clone();
        this.random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuffled = new int[nums.length];
        for (int i = 0; i < nums.length; i++) { // for each num[i], random insert to th shuffled array
            int selectedNum = nums[i];
            int indexToInsert = random.nextInt(i + 1);
            shuffled[i] = shuffled[indexToInsert]; // empty the slot for insertion
            shuffled[indexToInsert] = nums[i];
        }
        return shuffled;
    }
}
