package com.java.ccnu;

import java.util.Stack;

/**
 * @author ganccl
 * @create 2022-08-02 15:47
 * 用栈实现队列
 *
 */
public class Solution232_1 {
    class MyQueue{

        private Stack<Integer> stackIn;
        private Stack<Integer> stackOut;
        private int front;

        public MyQueue(){
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void push(int x){
            if(stackIn.empty()){
                front = x;
            }
            stackIn.push(x);
        }

        public int pop(){
            if(stackOut.empty()){
                while (!stackIn.empty()){
                    stackOut.push(stackIn.pop());
                }
            }
            return stackOut.pop();
        }

        public int peek(){
            if(!stackOut.empty()){
                return stackOut.peek();
            }else {
                if(!stackIn.empty()){
                    return stackIn.peek();
                }else {
                    return -1;
                }
            }
        }

        public boolean empty(){
            if(stackIn.empty() && stackOut.empty()){
                return true;
            }else {
                return false;
            }
        }
    }
}
