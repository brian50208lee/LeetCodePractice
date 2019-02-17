package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P17_LetterCombinationOfPhoneNumberTest {

    @Test
    public void testLetterCombination() {
        // given
        P17_LetterCombinationOfPhoneNumber p17 = new P17_LetterCombinationOfPhoneNumber();
        //when

        //then
        Assert.assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), p17.letterCombinations("23"));
        Assert.assertEquals(Arrays.asList(), p17.letterCombinations(""));
    }
}