package com.java.ccnu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//234.回文链表
//使用数组结构

public class Solution234_1 {
	//Definition for singly-linked list
	public class ListNode{
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
	public boolean isPalindrome(ListNode head){
		List<Integer> vals = new ArrayList<Integer>();//新建数组
		//将链表中的值复制到数组中
		while(head != null){
			vals.add(head.val);
			head = head.next;
		}
		
		//使用双指针法
		int left = 0;
		int right = vals.size() - 1;
		while(left < right){
			if(vals.get(left) != vals.get(right)){
				return false;
			}
			++left;
			--right;
		}
		return true;
		
	}
	
	
	
}
