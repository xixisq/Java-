package com.java.ccnu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ganccl
 * @create 2022-09-12 17:02
 * 二叉树的层序遍历
 */
public class Solution102_1 {

    public static void main(String[] args) {
        Solution102_1 test = new Solution102_1();
        TreeNode root = new TreeNode(1,new TreeNode(2,null,null),null);

        List<List<Integer>> res = test.levelOrder(root);
        System.out.println(res);
    }

    //层序遍历
    public List<List<Integer>> levelOrder(TreeNode root){
        //最终返回的数组链表
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }

        //新建队列
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        //遍历二叉树
        while(!queue.isEmpty()){
            //每一层的数组
            List<Integer> level = new ArrayList<>();
            int currentSize = queue.size();
            for (int i = 1;i <= queue.size();i++){
                TreeNode node = new TreeNode();
                node = queue.poll();
                level.add(node.val);

                //下一层入队列
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }

            res.add(level);
        }

    return res;

    }
}


