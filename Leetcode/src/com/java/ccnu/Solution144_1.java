package com.java.ccnu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ganccl
 * @create 2022-09-01 20:51
 * 二叉树的前序遍历 中左右
 */
public class Solution144_1 {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        preorder(root,res);
        return res;
    }

    public void preorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}
