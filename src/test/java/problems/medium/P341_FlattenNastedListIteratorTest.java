package problems.medium;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.NestedInteger;
import problems.structure.NestedIntegerImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P341_FlattenNastedListIteratorTest {
    @Test
    public void testNestedInteger() {
        // given
        List<NestedInteger> nestedList = Arrays.asList(
                new NestedIntegerImpl(Arrays.asList(new NestedIntegerImpl(1), new NestedIntegerImpl(1))),
                new NestedIntegerImpl(2),
                new NestedIntegerImpl(Arrays.asList(new NestedIntegerImpl(1), new NestedIntegerImpl(1)))
        );

        List<Integer> expected = Arrays.asList(1, 1, 2, 1, 1);

        // when
        List<Integer> results = new ArrayList<>();
        P341_FlattenNastedListIterator i = new P341_FlattenNastedListIterator(nestedList);
        while (i.hasNext()) {
            results.add(i.next());
        }
        
        // then
        Assert.assertEquals(expected.toString(), results.toString());
    }

    @Test
    public void testNestedInteger2() {
        // given
        List<NestedInteger> nestedList = Arrays.asList(
                new NestedIntegerImpl(1),
                new NestedIntegerImpl(Arrays.asList(
                        new NestedIntegerImpl(4),
                        new NestedIntegerImpl(Arrays.asList(
                                new NestedIntegerImpl(6)
                        ))
                ))
        );

        List<Integer> expected = Arrays.asList(1, 4, 6);

        // when
        List<Integer> results = new ArrayList<>();
        P341_FlattenNastedListIterator i = new P341_FlattenNastedListIterator(nestedList);
        while (i.hasNext()) {
            results.add(i.next());
        }

        // then
        Assert.assertEquals(expected.toString(), results.toString());
    }


    @Test
    public void testNestedInteger3() {
        // given
        List<NestedInteger> nestedList = Arrays.asList(
                new NestedIntegerImpl(Arrays.asList(
                        new NestedIntegerImpl(1),
                        new NestedIntegerImpl(1))),
                new NestedIntegerImpl(2),
                new NestedIntegerImpl(Arrays.asList(
                        new NestedIntegerImpl(1),
                        new NestedIntegerImpl(Arrays.asList(
                                new NestedIntegerImpl(4),
                                new NestedIntegerImpl(5)
                        )))
                )
        );

        List<Integer> expected = Arrays.asList(1, 1, 2, 1, 4, 5);

        // when
        List<Integer> results = new ArrayList<>();
        P341_FlattenNastedListIterator i = new P341_FlattenNastedListIterator(nestedList);
        while (i.hasNext()) {
            results.add(i.next());
        }

        // then
        Assert.assertEquals(expected.toString(), results.toString());
    }

    @Test
    public void testNestedInteger4() {
        // given
        List<NestedInteger> nestedList = Arrays.asList(
                new NestedIntegerImpl(Arrays.asList())
        );

        List<Integer> expected = Arrays.asList();

        // when
        List<Integer> results = new ArrayList<>();
        P341_FlattenNastedListIterator i = new P341_FlattenNastedListIterator(nestedList);
        while (i.hasNext()) {
            results.add(i.next());
        }

        // then
        Assert.assertEquals(expected.toString(), results.toString());
    }

    @Test
    public void testNestedInteger5() {
        // given
        List<NestedInteger> nestedList = Arrays.asList(
                new NestedIntegerImpl(Arrays.asList()),
                new NestedIntegerImpl(Arrays.asList(new NestedIntegerImpl(Arrays.asList()))),
                new NestedIntegerImpl(-4)
        );

        List<Integer> expected = Arrays.asList(-4);

        // when
        List<Integer> results = new ArrayList<>();
        P341_FlattenNastedListIterator i = new P341_FlattenNastedListIterator(nestedList);
        while (i.hasNext()) {
            results.add(i.next());
        }

        // then
        Assert.assertEquals(expected.toString(), results.toString());
    }
}