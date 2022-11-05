package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-09-02 16:59
 * 对称二叉树
 */
public class Solution101_1 {
    public boolean isSymmetric(TreeNode root){
        return check(root,root);

    }

    public boolean check(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return (p.val == q.val) && check(p.right,q.left) && check(p.left,q.right);
    }
}
