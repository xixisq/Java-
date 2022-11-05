package com.java.ccnu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//148.排序链表
//升序排序
public class Solution148_1 {

	//Definition for singly-linked list
	private class ListNode{
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val){this.val = val;}
		ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
	public ListNode sortList(ListNode head){
		//判断是否为空链表
		if(head == null){return null;}
		//List<Integer> vals = new ArrayList<Integer>();//新建数组
		int[] vals = new int[lengthList(head)];
		int i = 0;
		while(head != null){
			vals[i++] = head.val;
			head = head.next;
		}
		
		Arrays.sort(vals);
		//将数组转化为链表
		ListNode head1 = new ListNode(vals[0]);
		ListNode other = head1;
		for(i=1;i<vals.length;i++){
			ListNode temp = new ListNode(vals[i]);
			other.next = temp;
			other = other.next;
		}
		return head1;
	}
	
	
	
	public int lengthList(ListNode head){
		int length = 0;
		while(head != null){
			length++;
			head = head.next;
		}
		return length;
	}
}
