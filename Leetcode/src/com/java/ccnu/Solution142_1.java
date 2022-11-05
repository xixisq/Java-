package com.java.ccnu;
//环形链表
//方法一：哈希表 Set<ListNode> visited = new HashSet<ListNode>();
import java.util.HashSet;
import java.util.Set;

public class Solution142_1 {
	public ListNode detectCycle(ListNode head){
		ListNode pos = head;
		Set<ListNode> visited = new HashSet<ListNode>();//?
		
		while(pos != null){
			if(visited.contains(pos)){
				return pos;
			}else{
				visited.add(pos);
			}
			pos = pos.next;
		}
		
		return null;
		
	}
	
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
}
