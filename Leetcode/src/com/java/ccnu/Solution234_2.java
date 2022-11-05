package com.java.ccnu;

//234.回文链表
//快慢指针
public class Solution234_2 {
	// Definition for singly-linked list
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	//寻找前半部分链表的尾结点
	private ListNode endOfFirstHalf(ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		if(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;//前半部分尾结点
	}
	
	//反转链表
	private ListNode reverseList(ListNode head){
		ListNode curr = head;
		ListNode prev = null;
		while(curr != null){
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		
		return prev;
	}
	
	public boolean isPalindrome(ListNode head){
		ListNode firstList = endOfFirstHalf(head);
		ListNode secondList = reverseList(firstList.next);
		
		ListNode p1 = head;
		ListNode p2 = secondList;
		boolean result = true;
		while(result && p2 != null){
			if(p1.val != p2.val){
				result = false;
			}
			p2 = p2.next;
			p1 = p1.next;
		}
		
		return result;
		
	}
}
