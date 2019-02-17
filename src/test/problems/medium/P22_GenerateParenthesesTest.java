package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P22_GenerateParenthesesTest {
    @Test
    public void testGenerateParenthesis() {
        // given
        P22_GenerateParentheses p22 = new P22_GenerateParentheses();
        int n = 3;
        List<String> expected = Arrays.asList(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()");
        //when
        List<String> result = p22.generateParenthesis(n);

        //then
        Assert.assertEquals(expected, result);
    }
}