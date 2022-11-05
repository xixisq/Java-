package com.offerll.java;
/*
 * 剑指offer ll
 * 024.反转链表
 * 
 * */
public class Solution24_1 {
	
	//Definition for singly-linked list
	public class ListNode{
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val){this.val = val;}
		ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
	public ListNode reverseList(ListNode head){
		ListNode prev = null;
		ListNode curr = head;
		while(curr != null){
			ListNode next = curr.next;//设置中间变量
			curr.next = prev;//?prev = curr.next
			prev = curr;//prev、curr指针移动
			curr = next;
		}
		
		return prev;
	}

}


