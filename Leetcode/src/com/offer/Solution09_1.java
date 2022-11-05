package com.offer;

import java.util.Stack;

/**
 * @author ganccl
 * @create 2022-08-02 15:10
 */
public class Solution09_1 {
    class CQueue{
        //两个栈，一个出栈，一个入栈
        private Stack<Integer> stackIn;
        private Stack<Integer> stackOut;

        public CQueue(){
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void appendTail(int value){
            stackIn.push(value);
        }

        public int deleteHead(){
            if(!stackOut.empty()){
                return stackOut.pop();
            }else{
                if (!stackIn.empty()){
                    return stackIn.pop();
                }else {
                    return -1;
                }
            }
        }
    }
}
