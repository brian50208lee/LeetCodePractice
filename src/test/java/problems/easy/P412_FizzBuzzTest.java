package problems.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P412_FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        // given
        P412_FizzBuzz p412 = new P412_FizzBuzz();
        int n = 15;
        List<String> expected = Arrays.asList(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
        );

        //when
        List<String> result = p412.fizzBuzz(n);

        //then
        Assert.assertEquals(expected.toString(), result.toString());
    }
}