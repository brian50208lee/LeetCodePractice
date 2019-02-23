package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P150_EvaluateReversePolishNotationTest {
    @Test
    public void testEvalRPN() {
        P150_EvaluateReversePolishNotation p150 = new P150_EvaluateReversePolishNotation();
        Assert.assertEquals(9, p150.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    public void testEvalRPN2() {
        P150_EvaluateReversePolishNotation p150 = new P150_EvaluateReversePolishNotation();
        Assert.assertEquals(6, p150.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    public void testEvalRPN3() {
        P150_EvaluateReversePolishNotation p150 = new P150_EvaluateReversePolishNotation();
        Assert.assertEquals(22, p150.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}