package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P28_ImplementStrStrTest {
    @Test
    public void testStrStr() {
        // given
        P28_ImplementStrStr implementStrStrSolver = new P28_ImplementStrStr();

        //then
        Assert.assertEquals(2, implementStrStrSolver.strStr("hello", "ll"));
        Assert.assertEquals(-1, implementStrStrSolver.strStr("aaaaa", "bba"));
    }
}