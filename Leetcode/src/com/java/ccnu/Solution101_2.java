package com.java.ccnu;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ganccl
 * @create 2022-09-02 17:14
 * 迭代法
 */
public class Solution101_2 {
    public boolean isSymmetric(TreeNode root){
        return check(root,root);

    }

    private boolean check(TreeNode u, TreeNode v) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(u);
        queue.offer(v);
        while(!queue.isEmpty()){
            u = queue.poll();
            v = queue.poll();
            if(u == null && v == null){
                continue;
            }
            if(u == null || v == null || u.val != v.val){
                return false;
            }

            queue.offer(u.left);
            queue.offer(v.right);
            queue.offer(u.right);
            queue.offer(v.left);
        }
        return true;
    }
}
