package problems.easy;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.ListNode;

public class P234_PalindromeLinkedListTest {
    @Test
    public void testIsPalindrome() {
        // given
        P234_PalindromeLinkedList p234 = new P234_PalindromeLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        //then
        Assert.assertEquals(false, p234.isPalindrome(head));
    }

    @Test
    public void testIsPalindrome2() {
        // given
        P234_PalindromeLinkedList p234 = new P234_PalindromeLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        //then
        Assert.assertEquals(true, p234.isPalindrome(head));
    }
}