package problems.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class P210_CourseScheduleIITest {
    @Test
    public void testFindOrder() {
        // given
        P210_CourseScheduleII p210 = new P210_CourseScheduleII();
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        int[] expected = {0, 1};
        //when
        int[] result = p210.findOrder(numCourses, prerequisites);
        //then
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testFindOrder2() {
        // given
        P210_CourseScheduleII p210 = new P210_CourseScheduleII();
        int numCourses = 4;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        int[] expected = {0, 1, 2, 3};
        int[] expected2 = {0, 2, 1, 3};
        //when
        int[] result = p210.findOrder(numCourses, prerequisites);
        //then
        Assert.assertTrue(Arrays.toString(expected).equals(Arrays.toString(result))
                || Arrays.toString(expected2).equals(Arrays.toString(result)));
    }
}