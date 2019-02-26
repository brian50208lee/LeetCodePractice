package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P334_IncreasingTripletSubsequenceTest {
    @Test
    public void testTriplet() {
        P334_IncreasingTripletSubsequence p334 = new P334_IncreasingTripletSubsequence();
        Assert.assertTrue(p334.increasingTriplet(new int[]{1,2,3,4,5}));
    }

    @Test
    public void testTriplet2() {
        P334_IncreasingTripletSubsequence p334 = new P334_IncreasingTripletSubsequence();
        Assert.assertFalse(p334.increasingTriplet(new int[]{5,4,3,2,1}));
    }

    @Test
    public void testTriplet3() {
        P334_IncreasingTripletSubsequence p334 = new P334_IncreasingTripletSubsequence();
        Assert.assertTrue(p334.increasingTriplet(new int[]{4,6,1,2,5}));
    }


    @Test
    public void testTriplet4() {
        P334_IncreasingTripletSubsequence p334 = new P334_IncreasingTripletSubsequence();
        Assert.assertTrue(p334.increasingTriplet(new int[]{4,6,1,2,3}));
    }

    @Test
    public void testTriplet5() {
        P334_IncreasingTripletSubsequence p334 = new P334_IncreasingTripletSubsequence();
        Assert.assertFalse(p334.increasingTriplet(new int[]{4,6,1,2,1}));
    }
}