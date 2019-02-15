package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P58_LengthOfLastWordTest {
    @Test
    public void testLengthOfLastWord() {
        // given
        P58_LengthOfLastWord lengthOfLastWordSolver = new P58_LengthOfLastWord();

        //when

        //then
        Assert.assertEquals(5, lengthOfLastWordSolver.lengthOfLastWord("Hello World"));
        Assert.assertEquals(1, lengthOfLastWordSolver.lengthOfLastWord("a "));
    }
}