package problems.easy;

import java.util.Arrays;

public class P204_CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 3; i <= Math.sqrt(n); i += 2) { // ignore 2x
            if (isPrime[i]) {
                for (int j = 3 * i; j < n; j += 2 * i) { // ignore 2x
                    isPrime[j] = false;
                }
            }
        }

        int count = 1; // 2
        for (int i = 3; i < n; i += 2) { // ignore 2x
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
