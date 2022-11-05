package com.java.ccnu;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author ganccl
 * @create 2022-07-18 11:19
 */

//20.有效的括号。
// 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

public class Solution20_1 {
    public boolean isValid(String s){
        int length = s.length();
        if (length % 2 == 1){
            return false;
        }


        //创建hashmap
        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');

        //创建stack对象
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i < length;i++){
            char c = s.charAt(i);
            if(pairs.containsKey(c)){
                if(stack.empty() || stack.peek() != pairs.get(c)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            };
        }


        return stack.empty();//返回不能直接写TRUE
    }

    public static void main(String[] args) {
        Solution20_1 test = new Solution20_1();
        System.out.println(test.isValid("{{[]}}"));
    }
}
