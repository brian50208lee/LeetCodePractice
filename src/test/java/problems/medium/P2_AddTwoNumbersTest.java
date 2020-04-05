package problems.medium;

import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P2_AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        // given
        P2_AddTwoNumbers addTwoNumbersSolver = new P2_AddTwoNumbers();
        ListNode list1 = ListNodeTest.createLinkedListByArray(new int[]{2, 4, 3});
        ListNode list2 = ListNodeTest.createLinkedListByArray(new int[]{5, 6, 4});
        ListNode expectedResult = ListNodeTest.createLinkedListByArray(new int[]{7, 0, 8});

        //when
        ListNode result = addTwoNumbersSolver.addTwoNumbers(list1, list2);

        //then
        ListNodeTest.assertLinkedListEquals(expectedResult, result);
    }


}