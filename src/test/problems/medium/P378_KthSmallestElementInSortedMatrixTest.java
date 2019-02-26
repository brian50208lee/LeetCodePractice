package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P378_KthSmallestElementInSortedMatrixTest {
    @Test
    public void testKthSmallest() {
        // given
        P378_KthSmallestElementInSortedMatrix p378 = new P378_KthSmallestElementInSortedMatrix();
        int[][] matrix = {
            {1,  5,  9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        //when

        //then
        Assert.assertEquals(13, p378.kthSmallest(matrix, k));
    }
}