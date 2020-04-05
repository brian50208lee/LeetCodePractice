package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P380_InsertDeleteGetRandomO1Test {
    @Test
    public void testRandomizedSet() {
        // given
        P380_InsertDeleteGetRandomO1 obj = new P380_InsertDeleteGetRandomO1();

        //when

        //then
        Assert.assertTrue(obj.insert(1));
        Assert.assertFalse(obj.remove(2));
        Assert.assertTrue(obj.insert(2));

        int random = obj.getRandom();
        Assert.assertTrue(random == 1 || random == 2);

        Assert.assertTrue(obj.remove(1));
        Assert.assertFalse(obj.insert(2));

        Assert.assertEquals(2, obj.getRandom());
    }
}