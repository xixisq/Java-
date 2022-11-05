package com.java.ccnu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ganccl
 * @create 2022-10-05 17:28
 *
 * 电话号码的字母组合
 */
public class Solution17_1 {

    public List<String> letterCombinations(String digits){
        //新建链表存储输出结果
        List<String> combinations = new ArrayList<String>();

        if(digits.length() == 0){
            return combinations;
        }

        //数字 字母--->Map
        Map<Character,String> phoneMap = new HashMap<Character,String>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"yuv");
            put('9',"wxyz");
        }};
        backtrack(combinations,phoneMap,digits,0,new StringBuffer());
        return combinations;

    }

    public void backtrack(List<String> combinations,Map<Character,String> phoneMap,
                          String digits,int index,StringBuffer combination){
        if(index == digits.length()){
            combinations.add(combination.toString());
        }else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);

            int lettersCount = letters.length();
            for(int i = 0;i < lettersCount;i++){
                combination.append(letters.charAt(i));
                backtrack(combinations,phoneMap,digits,index + 1,combination);
                combination.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        Solution17_1 test = new Solution17_1();
        String digits = "";
        List<String> strings = test.letterCombinations(digits);
        System.out.println(strings);
    }
    
}
