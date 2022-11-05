package com.java.ccnu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ganccl
 * @create 2022-09-01 21:02
 * 二叉树的后续遍历 左右中
 */
public class Solution145_1 {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        postorder(root,res);
        return res;
    }

    public void postorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
}
