package com.java.ccnu;
//19.删除链表的倒数第N个结点



public class Solution19_1 {

	public ListNode removeNthFromEnd(ListNode head,int n){
		ListNode dummy = new ListNode(0,head);
		ListNode curr = dummy;
		int len = getLength(head);
		for(int i=1;i<len-n+1;i++){
			curr = curr.next;
		}
		curr.next = curr.next.next;
		ListNode ans = dummy.next;
		return ans;
		
	}
	
	//计算链表的长度
	public int getLength(ListNode head){
		int len = 0;
		while(head != null){
			len++;
			head = head.next;
		}
		return len;
	}
	
	//Definition for singly-linked list
	class ListNode{
		int val;
		ListNode next;
		ListNode(){};
		ListNode(int val){};
		ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;
		}
		
	}
}
