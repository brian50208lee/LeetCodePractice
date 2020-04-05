package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P35_SearchInsertPositionTest {

    @Test
    public void testSearchInsert() {
        // given
        P35_SearchInsertPosition searchInsertPositionSolver = new P35_SearchInsertPosition();

        //when

        //then
        Assert.assertEquals(2, searchInsertPositionSolver.searchInsert(new int[]{1,3,5,6}, 5));
        Assert.assertEquals(1, searchInsertPositionSolver.searchInsert(new int[]{1,3,5,6}, 2));
        Assert.assertEquals(4, searchInsertPositionSolver.searchInsert(new int[]{1,3,5,6}, 7));
        Assert.assertEquals(0, searchInsertPositionSolver.searchInsert(new int[]{1,3,5,6}, 0));
    }
}