package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P227_BasicCalculatorIITest {
    @Test
    public void testCalculate() {
        P227_BasicCalculatorII p227 = new P227_BasicCalculatorII();
        Assert.assertEquals(7, p227.calculate("3+2*2"));
    }

    @Test
    public void testCalculate2() {
        P227_BasicCalculatorII p227 = new P227_BasicCalculatorII();
        Assert.assertEquals(1, p227.calculate(" 3/2 "));
    }


    @Test
    public void testCalculate3() {
        P227_BasicCalculatorII p227 = new P227_BasicCalculatorII();
        Assert.assertEquals(5, p227.calculate(" 3+5 / 2 "));
    }


    @Test
    public void testCalculate4() {
        P227_BasicCalculatorII p227 = new P227_BasicCalculatorII();
        Assert.assertEquals(35, p227.calculate("+35"));
    }


    @Test
    public void testCalculate5() {
        P227_BasicCalculatorII p227 = new P227_BasicCalculatorII();
        Assert.assertEquals(-9, p227.calculate("-9"));
    }


    @Test
    public void testCalculate6() {
        P227_BasicCalculatorII p227 = new P227_BasicCalculatorII();
        Assert.assertEquals(-180, p227.calculate("-9 * 20"));
    }


    @Test
    public void testCalculate7() {
        P227_BasicCalculatorII p227 = new P227_BasicCalculatorII();
        Assert.assertEquals(0, p227.calculate("0"));
    }
}