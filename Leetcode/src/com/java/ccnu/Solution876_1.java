package com.java.ccnu;
//876.链表的中间节点

import com.java.ccnu.Solution19_1.ListNode;

public class Solution876_1 {

	public ListNode middleNode(ListNode head){
		int len = getLength(head);
		if(len % 2 == 1){
			for(int i=0;i<(len-1)/2;i++){
				head = head.next;
			}
		}else{
			for(int i=0;i<len/2;i++){
				head = head.next;
			}
		}
		return head;
	}
	
	//计算链表的长度
	public int getLength(ListNode head){
		int len = 0;
		while(head != null){
			++len;
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
