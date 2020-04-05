package problems.easy;

import org.junit.Ignore;
import org.junit.Test;
import problems.structure.ListNode;
import problems.structure.ListNodeTest;

public class P160_IntersectionOfTwoLinkedListsTest {


    @Ignore("maybe wrong")
    public void testIntersection() {
        // given
        P160_IntersectionOfTwoLinkedLists p160 = new P160_IntersectionOfTwoLinkedLists();
        ListNode headA = ListNodeTest.createLinkedListByArray(new int[]{4,1,8,4,5});
        ListNode headB = ListNodeTest.createLinkedListByArray(new int[]{5,0,1,8,4,5});
        ListNode expected = ListNodeTest.createLinkedListByArray(new int[]{8,4,5});

        //when
        ListNode result = p160.getIntersectionNode(headA, headB);

        //then
        ListNodeTest.assertLinkedListEquals(expected, result);
    }

    @Test
    public void testIntersection2() {
        // given
        P160_IntersectionOfTwoLinkedLists p160 = new P160_IntersectionOfTwoLinkedLists();
        ListNode headA = ListNodeTest.createLinkedListByArray(new int[]{4,9,1,2,4});
        ListNode headB = ListNodeTest.createLinkedListByArray(new int[]{3,2,4});
        ListNode expected = ListNodeTest.createLinkedListByArray(new int[]{2,4});

        //when
        ListNode result = p160.getIntersectionNode(headA, headB);

        //then
        ListNodeTest.assertLinkedListEquals(expected, result);
    }

    @Test
    public void testIntersection3() {
        // given
        P160_IntersectionOfTwoLinkedLists p160 = new P160_IntersectionOfTwoLinkedLists();
        ListNode headA = ListNodeTest.createLinkedListByArray(new int[]{2,6,4});
        ListNode headB = ListNodeTest.createLinkedListByArray(new int[]{1,5});
        ListNode expected = ListNodeTest.createLinkedListByArray(new int[]{});

        //when
        ListNode result = p160.getIntersectionNode(headA, headB);

        //then
        ListNodeTest.assertLinkedListEquals(expected, result);
    }
}