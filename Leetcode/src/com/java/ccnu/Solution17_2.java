package com.java.ccnu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ganccl
 * @create 2022-10-26 10:26
 *
 * 回溯算法
 */
public class Solution17_2 {
    public List<String> letterCombinations(String digits){
        //新建链表存储输出结果
        List<String> combinations = new ArrayList<String>();

//        if(digits == ""){
        if(digits.length() == 0){
            return combinations;
        }
        //创建Map集合
        Map<Character,String> phoneMap = new HashMap<Character,String>();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");

        backTrack(combinations,phoneMap,digits,0,new StringBuffer());
        return combinations;
    }

    //回溯函数
    public void backTrack(List<String> combinations,Map<Character,String> phoneMap,
                          String digits,int index,StringBuffer combination){
        if(digits.length() == index){
            combinations.add(combination.toString());
        }
        else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);

            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backTrack(combinations,phoneMap,digits,index+1,combination);
                //删除索引位置上的元素，比如输出“ad”之后要将“d”删除，便于后续将“ae”加入
                combination.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        String digits = "";
        List<String> combinations = new ArrayList<String>();
        Solution17_2 test = new Solution17_2();
        List<String> list = test.letterCombinations(digits);
        System.out.println(list);
    }
}
