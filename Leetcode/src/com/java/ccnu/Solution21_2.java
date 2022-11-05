package com.java.ccnu;

import com.java.ccnu.Solution21_1.ListNode;

//21.合并两个有序链表
//递归方法.
//递归只考虑当前层做什么事，递归终止条件
public class Solution21_2 {
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

	// 合并有序链表
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		} else if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next,list2);
			return list1;
		}else{
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}

	}
}
