package problems.medium;

public class P287_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int lowerBound = 1;
        int upperBound = n;
        while (lowerBound < upperBound) {
            int guess = lowerBound + (upperBound - lowerBound) / 2;
            int lessOrEqualGuess = 0;
            for (int num : nums) {
                if (num <= guess) {
                    lessOrEqualGuess++;
                }
            }
            if (lessOrEqualGuess > guess) { // answer in (lowerBound, guess)
                upperBound = guess;
            } else { // answer in (guess + 1, upperBound)
                lowerBound = guess + 1;
            }
        }
        return lowerBound;
    }
}
