package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P134_GasStationTest {
    @Test
    public void testCanCompleteCircuit() {
        // given
        P134_GasStation p134 = new P134_GasStation();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        //when

        //then
        Assert.assertEquals(3, p134.canCompleteCircuit(gas, cost));
    }

    @Test
    public void testCanCompleteCircuit2() {
        // given
        P134_GasStation p134 = new P134_GasStation();
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};

        //when

        //then
        Assert.assertEquals(-1, p134.canCompleteCircuit(gas, cost));
    }
}