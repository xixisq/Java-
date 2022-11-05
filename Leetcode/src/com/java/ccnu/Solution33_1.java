package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-09-20 10:54
 * 二分查找 一半是有序的，另一半可能是有序的，也可能不是有序的
 * 1.先判断是否有序，在判断是否在内
 * 2.判断是否有序 nums[mid] > nums[0]
 */
public class Solution33_1 {
    public int search(int[] nums,int target){
        int n = nums.length;
        if(n == 0){
            return -1;
        }
        if(n == 1){
            return target == nums[0] ? 0 : -1;
        }

        int left = 0,right = n - 1;

        while (left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[0]){
                if(nums[mid] > target && nums[0] <= target){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[n-1]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }

            }

        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};

        Solution33_1 test = new Solution33_1();
        System.out.println(test.search(nums, 0));
    }

}
