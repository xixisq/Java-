package com.java.ccnu;

/**
 * 暴力解法2
 * 注意数组角标越界
 *
 * @author ganccl
 * @create 2022-07-22 10:33
 */
public class Solution84_2 {
    public int largestRectangleArea(int[] heights){
        int len = heights.length;
        if(len == 0){
            return 0;
        }

        int res = 0;
        for(int i = 0;i < len;i++){
            //找左边最后一个大于等于heights[i]的下标
            int left = i;
            int currheight = heights[i];
            while(left > 0 && heights[left - 1] >= currheight){
                left--;
            }
            //找右边最后一个大于等于heights[i]的下标
            int right = i;
            while (right < len - 1 && heights[right + 1] >= currheight){
                right++;
            }
            int width = right -left + 1;
            res = Math.max(res,heights[i] * width);
        }
        return res;
    }
}
