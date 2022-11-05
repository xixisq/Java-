package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-07-18 10:26
 */

//206.反转链表

public class Solution206_1 {
    public ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
