package problems.structure;

import org.junit.Assert;
import org.junit.Test;

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
        if (expected == null) {
            Assert.assertNull(actual);
        } else {
            Assert.assertNotNull(actual);
            Assert.assertEquals(expected.toString(), actual.toString());
        }
    }
}