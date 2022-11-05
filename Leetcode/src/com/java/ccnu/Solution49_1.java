package com.java.ccnu;

import java.util.*;

/**
 * @author ganccl
 * @create 2022-10-12 10:41
 * 字母异位词分组
 * 互为异位词的字符重新排序之后得到新的字符串一致
 */
public class Solution49_1 {
    public List<List<String>> groupAnagrams(String[] strs){
        //k,v值
        Map<String,List<String>> map = new HashMap<String,List<String>>();

        for (String str : strs){
            //将字符串转化为字符型数组
            char[] array = str.toCharArray();
            //将数组排序
            Arrays.sort(array);
            //得到一个key
            String key = new String(array);
            //如果存在key，返回对应的value
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());

    }

    public static void main(String[] args) {
        Solution49_1 test = new Solution49_1();
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};

        System.out.println(test.groupAnagrams(strs));
    }
}
