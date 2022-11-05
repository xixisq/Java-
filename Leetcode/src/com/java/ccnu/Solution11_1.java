package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-09-13 10:25
 * 贪心算法 双指针
 */
public class Solution11_1 {

    public static void main(String[] args) {
        Solution11_1 test = new Solution11_1();
        int height[] = new int[]{1,8,6,2,5,4,8,3,7};
        int maxArea = test.maxArea(height);
        System.out.println(maxArea);
    }


    public int maxArea(int[] height){
        int left = 0,right = height.length - 1;
        int maxArea = 0;
        while (left < right){
            int currentArea = Math.min(height[left],height[right]) * (right - left);
            maxArea = Math.max(currentArea,maxArea);
            if(height[left] < height[right]){
                ++left;
            }else {
                --right;
            }

        }

        return maxArea;
    }
}
