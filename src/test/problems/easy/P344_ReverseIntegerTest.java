package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P344_ReverseIntegerTest {
    @Test
    public void testReversingString() {
        // given
        P344_ReverseInteger p344 = new P344_ReverseInteger();
        char[] s = "hello".toCharArray();
        char[] expected = "olleh".toCharArray();

        //when
        p344.reverseString(s);

        //then
        Assert.assertArrayEquals(expected, s);
    }

    @Test
    public void testReversingString2() {
        // given
        P344_ReverseInteger p344 = new P344_ReverseInteger();
        char[] s = "Hannah".toCharArray();
        char[] expected = "hannaH".toCharArray();

        //when
        p344.reverseString(s);

        //then
        Assert.assertArrayEquals(expected, s);
    }
}