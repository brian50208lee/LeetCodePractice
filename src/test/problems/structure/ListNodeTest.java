package problems.structure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeTest {

    @Test
    public void testToString() {
        // given

        // when

        // then
        ListNode listNode = createLinkedListByArray(new int[]{1, 2, 3});
        Assert.assertEquals("1, 2, 3", listNode.toString());
    }

    public static ListNode createLinkedListByArray(int[] numbers) {
        if (numbers.length < 1) {
            return null;
        }

        int lastIndex = numbers.length - 1;
        ListNode head = new ListNode(numbers[lastIndex]);
        for (int i = lastIndex - 1; i >= 0; i--) {
            ListNode previousNode = new ListNode(numbers[i]);
            previousNode.next = head;
            head = previousNode;
        }

        return head;
    }

    public static void assertLinkedListEquals(ListNode expected, ListNode actual) {
        Assert.assertNotNull(expected);
        Assert.assertNotNull(actual);
        while (expected != null && actual != null) {
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assert.assertNull(expected);
        Assert.assertNull(actual);
    }
}