package problems.medium;

public class P134_GasStation {
    private static final int RESULTS_NOT_EXISTS = -1;

    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (canComplete(gas, cost, i)) {
                return i;
            }
        }
        return RESULTS_NOT_EXISTS;
    }

    private boolean canComplete(int[] gas, int[] cost, int start) {
        int remainGas = 0;
        for (int i = 0; i < gas.length; i++) {
            int currentIndex = (start + i) % gas.length;
            remainGas += gas[currentIndex] - cost[currentIndex];
            if (remainGas < 0) {
                return false;
            }
        }
        return true;
    }
}
