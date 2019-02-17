package problems.easy;

import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P83_RemoveDuplicatesFromSortedListTest {
    private P83_RemoveDuplicatesFromSortedList removeDuplicatesFromSortedListSolver;

    @Test
    public void testDeleteDuplicates() {
        // given
        removeDuplicatesFromSortedListSolver = new P83_RemoveDuplicatesFromSortedList();

        //when

        //then
        runExample(new int[]{1,1,2}, new int[]{1,2});
        runExample(new int[]{1,1,2,3,3}, new int[]{1,2,3});
    }

    private void runExample(int[] input, int[] expectedOutput) {
        ListNode inputNode = ListNodeTest.createLinkedListByArray(input);
        ListNode expectedNode = ListNodeTest.createLinkedListByArray(expectedOutput);
        ListNode resultNode = removeDuplicatesFromSortedListSolver.deleteDuplicates(inputNode);
        ListNodeTest.assertLinkedListEquals(expectedNode, resultNode);
    }
}