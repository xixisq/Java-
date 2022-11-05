package com.java.ccnu;

import java.util.HashSet;
import java.util.Set;

public class Solution160_1 {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        //创建哈希集合
        Set<ListNode> visited = new HashSet<ListNode>();

        ListNode temp = headA;
        while(temp != null){
            visited.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while (temp != null){
            if(visited.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }


    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}
