package problems.easy;

import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P21_MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() {
        // given
        P21_MergeTwoSortedLists mergeTwoSortedListsSolver = new P21_MergeTwoSortedLists();
        ListNode list1 = ListNodeTest.createLinkedListByArray(new int[]{1, 2, 4});
        ListNode list2 = ListNodeTest.createLinkedListByArray(new int[]{1, 3, 4});
        ListNode expectedResult = ListNodeTest.createLinkedListByArray(new int[]{1, 1, 2, 3, 4, 4});

        //when
        ListNode result = mergeTwoSortedListsSolver.mergeTwoLists(list1, list2);

        //then
        ListNodeTest.assertLinkedListEquals(expectedResult, result);
    }
}