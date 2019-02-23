package problems.medium;

import org.junit.Assert;
import org.junit.Test;

public class P207_CourseSchduleTest {
    @Test
    public void testCanFinish() {
        P207_CourseSchdule p207 = new P207_CourseSchdule();
        Assert.assertEquals(true, p207.canFinish(2, new int[][]{{1,0}}));
    }
    @Test
    public void testCanFinish2() {
        P207_CourseSchdule p207 = new P207_CourseSchdule();
        Assert.assertEquals(false, p207.canFinish(2, new int[][]{{1,0},{0,1}}));
    }
    @Test
    public void testCanFinish3() {
        P207_CourseSchdule p207 = new P207_CourseSchdule();
        Assert.assertEquals(false, p207.canFinish(2, new int[][]{{1,0},{1,2},{0,1}}));
    }
    @Test
    public void testCanFinish4() {
        P207_CourseSchdule p207 = new P207_CourseSchdule();
        Assert.assertEquals(true, p207.canFinish(3, new int[][]{{0,1},{0,2},{1,2}}));
    }
}