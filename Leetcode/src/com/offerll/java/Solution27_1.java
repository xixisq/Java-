package com.offerll.java;

import java.util.ArrayList;
import java.util.List;

//回文链表
//将值复制到数组中后用双指针法

public class Solution27_1 {

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
	
	public boolean isPalindrome(ListNode head){
		//将链表中的值复制到数组中
		List<Integer> vals = new ArrayList<Integer>();
		ListNode curr = head;
		while(curr != null){
			vals.add(curr.val);
			curr = curr.next;
			
		}
		
		//使用双指针判断
		int left = 0,right = vals.size() - 1;
		while(left < right){
			if(!vals.get(left).equals(vals.get(right))){
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
}
