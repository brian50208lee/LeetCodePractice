package problems.easy;

import org.junit.Assert;
import org.junit.Test;
import problems.structure.ListNode;

public class P141_LinkedListCycleTest {
    @Test
    public void testHasCycle() {
        // given
        P141_LinkedListCycle p141 = new P141_LinkedListCycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        //when

        //then
        Assert.assertEquals(true, p141.hasCycle(head));
    }

    @Test
    public void testHasCycle2() {
        // given
        P141_LinkedListCycle p141 = new P141_LinkedListCycle();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;

        //when

        //then
        Assert.assertEquals(true, p141.hasCycle(head));
    }

    @Test
    public void testHasCycle3() {
        // given
        P141_LinkedListCycle p141 = new P141_LinkedListCycle();
        ListNode head = new ListNode(1);

        //when

        //then
        Assert.assertEquals(false, p141.hasCycle(head));
    }

    @Test
    public void testHasCycleSet() {
        // given
        P141_LinkedListCycle p141 = new P141_LinkedListCycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        //when

        //then
        Assert.assertEquals(true, p141.hasCycleSet(head));
    }

    @Test
    public void testHasCycleSet2() {
        // given
        P141_LinkedListCycle p141 = new P141_LinkedListCycle();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;

        //when

        //then
        Assert.assertEquals(true, p141.hasCycleSet(head));
    }

    @Test
    public void testHasCycleSet3() {
        // given
        P141_LinkedListCycle p141 = new P141_LinkedListCycle();
        ListNode head = new ListNode(1);

        //when

        //then
        Assert.assertEquals(false, p141.hasCycleSet(head));
    }
}