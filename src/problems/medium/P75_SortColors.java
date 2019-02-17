package problems.medium;

public class P75_SortColors {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else if (num == 2) {
                two++;
            }
        }

        int count = 0;
        while (zero-- > 0) {
            nums[count++] = 0;
        }
        while (one-- > 0) {
            nums[count++] = 1;
        }
        while (two-- > 0) {
            nums[count++] = 2;
        }
    }
}
