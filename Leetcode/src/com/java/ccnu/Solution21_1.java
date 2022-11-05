package com.java.ccnu;

//21.合并两个有序链表
//将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
public class Solution21_1 {
	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode() {} ListNode(int val) { this.val = val; }
	 * ListNode(int val, ListNode next) { this.val = val; this.next = next; } }
	 */
	/*
	 * Definition for singly-linked list.
	 */
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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		ListNode dummyHead = new ListNode(0);
		ListNode curr = dummyHead;
		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				curr.next = list1;
				curr = curr.next;
				list1 = list1.next;
			}else{
				curr.next = list2;
				curr = curr.next;
				list2 = list2.next;
			}
			
		}
		if(list1 == null){
			curr.next = list2;
		}
		if(list2 == null){
			curr.next = list1;
		}
		return dummyHead.next;
		
	}

}
