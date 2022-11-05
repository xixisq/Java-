package com.java.ccnu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ganccl
 * @create 2022-09-01 19:43
 * 二叉树的中序遍历-递归法 左中右
 */
public class Solution94_1 {
    public List<Integer> inorderTraversal(TreeNode root){

        List<Integer> res = new ArrayList<Integer>();
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);

    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val = val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
