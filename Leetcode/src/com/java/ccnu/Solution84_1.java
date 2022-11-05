package com.java.ccnu;

/**
 * 84.柱状图中最大的矩形
 * 暴力解法超时
 *
 * @author ganccl
 * @create 2022-07-20 11:19
 */
public class Solution84_1 {
    public int largestRectangleArea(int[] heights){
        int area = heights[0],count = 0;
        for(int i = 0;i < heights.length;i++){
            count = 1;
            for (int j = i + 1; j < heights.length; j++) {
                if(heights[i] > heights[j]){
                    break;
                }
                count++;
                area = maxNum(heights[i] * count,area);
            }
            for (int j = i - 1; j >= 0; j--) {
                area = maxNum(heights[i] * count,area);
                if(heights[i] > heights[j]){
                    break;
                }
                count++;
                area = maxNum(heights[i] * count,area);
            }

        }
        return area;
    }

    public static void main(String[] args) {
        Solution84_1 test = new Solution84_1();
        int[] heights = {0,9};
        int num = test.largestRectangleArea(heights);
        System.out.println(num);
    }

    public int maxNum(int a,int b){
        if(a >= b){
            return a;
        }else {
            return b;
        }
    }
}
