package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P49_GroupAnagramsTest {
    @Test
    public void testGroupAnagrams() {
        // given
        P49_GroupAnagrams p49 = new P49_GroupAnagrams();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("eat","tea", "ate"));
        expected.add(Arrays.asList("bat"));
        expected.add(Arrays.asList("tan","nat"));

        //when
        List<List<String>> result = p49.groupAnagrams(strs);

        //then
        Assert.assertEquals(expected.toString(), result.toString());
    }
}