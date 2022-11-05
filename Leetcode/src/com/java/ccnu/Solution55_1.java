package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-09-19 20:41
 * 跳跃游戏
 * 判断每个位置能到达的最远距离
 */
public class Solution55_1 {
    public boolean canJump(int[] nums){
        int n = nums.length;
        int rightMost = 0;

        for(int i = 0;i < n;i++){
            if(i <= rightMost){
                rightMost = Math.max(rightMost,i+nums[i]);
                if(rightMost >= n - 1){
                    return true;
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Solution55_1 test = new Solution55_1();
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(test.canJump(nums));
    }
}
