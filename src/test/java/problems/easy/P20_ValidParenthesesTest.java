package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P20_ValidParenthesesTest {

    @Test
    public void testIsValid() {
        // given
        P20_ValidParentheses validParenthesesSolver = new P20_ValidParentheses();

        //when

        //then
        Assert.assertEquals(true, validParenthesesSolver.isValid("()"));
        Assert.assertEquals(true, validParenthesesSolver.isValid("()[]{}"));
        Assert.assertEquals(false, validParenthesesSolver.isValid("(]"));
        Assert.assertEquals(false, validParenthesesSolver.isValid("([)]"));
        Assert.assertEquals(true, validParenthesesSolver.isValid("{[]}"));
    }
}