package problems.medium;

import java.util.*;

public class P49_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if (!group.containsKey(sortedString)) {
                group.put(sortedString, new ArrayList<>());
            }
            group.get(sortedString).add(str);
        }

        List<List<String>> result = new ArrayList<>();
        result.addAll(group.values());

        return result;
    }
}
