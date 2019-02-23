package problems.medium;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.Interval;

import java.util.*;

public class P56_MergeIntervalTest {
    @Test
    public void testMerge() {
        // given
        P56_MergeInterval p56 = new P56_MergeInterval();
        List<Interval> interval = new ArrayList<>();
        interval.add(new Interval(1,3));
        interval.add(new Interval(2,6));
        interval.add(new Interval(8,10));
        interval.add(new Interval(15,18));

        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(1,6));
        expected.add(new Interval(8,10));
        expected.add(new Interval(15,18));

        //when
        List<Interval> results = p56.merge(interval);

        //then
        Set<String> expectedSet = new HashSet<>();
        for (Interval i : expected) {
            expectedSet.add(i.toString());
        }
        Set<String> actualSet = new HashSet<>();
        for (Interval i : results) {
            actualSet.add(i.toString());
        }
        Assert.assertEquals(expectedSet.toString(), actualSet.toString());
    }

    @Test
    public void testMerge2() {
        // given
        P56_MergeInterval p56 = new P56_MergeInterval();
        List<Interval> interval = new ArrayList<>();
        interval.add(new Interval(1,4));
        interval.add(new Interval(4,5));

        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(1,5));

        //when
        List<Interval> results = p56.merge(interval);

        //then
        Set<String> expectedSet = new HashSet<>();
        for (Interval i : expected) {
            expectedSet.add(i.toString());
        }
        Set<String> actualSet = new HashSet<>();
        for (Interval i : results) {
            actualSet.add(i.toString());
        }
        Assert.assertEquals(expectedSet.toString(), actualSet.toString());
    }

    @Test
    public void testMerge3() {
        // given
        P56_MergeInterval p56 = new P56_MergeInterval();
        List<Interval> interval = new ArrayList<>();
        interval.add(new Interval(2,3));
        interval.add(new Interval(4,5));
        interval.add(new Interval(6,7));
        interval.add(new Interval(8,9));
        interval.add(new Interval(1,10));

        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(1,10));

        //when
        List<Interval> results = p56.merge(interval);

        //then
        Set<String> expectedSet = new HashSet<>();
        for (Interval i : expected) {
            expectedSet.add(i.toString());
        }
        Set<String> actualSet = new HashSet<>();
        for (Interval i : results) {
            actualSet.add(i.toString());
        }
        Assert.assertEquals(expectedSet.toString(), actualSet.toString());
    }

}