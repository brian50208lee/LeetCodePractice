package problems.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P179_LargestNumber {
    public String largestNumber(int[] nums) {
        List<String> strs = new ArrayList<>();
        for (int num : nums) {
            strs.add(Integer.toString(num));
        }

        strs.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Long.valueOf(o1+o2) > Long.valueOf(o2+o1)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        for (int i = 0; i < strs.size() - 1; i++) {
            if ("0".equals(strs.get(i))) {
                strs.set(i, "");
            } else {
                break;
            }
        }
        return String.join("", strs);
    }
}
