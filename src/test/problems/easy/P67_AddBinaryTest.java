package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P67_AddBinaryTest {
    @Test
    public void testAddBinary() {
        // given
        P67_AddBinary addBinarySolver = new P67_AddBinary();

        //when

        //then
        Assert.assertEquals("100", addBinarySolver.addBinary("11", "1"));
        Assert.assertEquals("10101", addBinarySolver.addBinary("1010", "1011"));
    }
}