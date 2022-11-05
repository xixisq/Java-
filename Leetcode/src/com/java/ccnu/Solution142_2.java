package com.java.ccnu;
//环形链表||
//快慢指针

public class Solution142_2 {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
		
	}
	
	public ListNode detectCycle(ListNode head){
		ListNode fast = head,slow = head;
		//判断是否为空链表
		if(head == null){
			return null;
		}
		
		//判断是否只有一个节点
		if(head.next == null){
			return null;
		}
		
		while(fast != null){
			slow = slow.next;
			if(fast.next != null){
				fast = fast.next.next;
			}else
			{
				return null;
			}
			
			if(fast == slow){
				ListNode ptr = head;
				while(ptr != slow){
					ptr = ptr.next;
					slow = slow.next;
				}
				return ptr;
			}
			
			
		}
		return null;
		
	}
}
