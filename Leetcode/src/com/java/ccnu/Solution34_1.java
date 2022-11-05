package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-10-04 15:25
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class Solution34_1 {
    public int[] searchRange(int[] nums,int target){
        int n = nums.length;
        int left = 0,right = n - 1;
        int[] searchRange = new int[2];

        if(n == 0){
            searchRange[0] = -1;
            searchRange[1] = -1;
            return searchRange;
        }
        if(n == 1){
            if(target == nums[0]){
                searchRange[0] = 0;
                searchRange[1] = 0;
            }else {
                searchRange[0] = -1;
                searchRange[1] = -1;
            }
            return searchRange;
        }
        if(target > nums[right] || target < nums[left]){
            searchRange[0] = -1;
            searchRange[1] = -1;
            return searchRange;
        }

        int mid = midSearch(nums,target);
        if(mid == -1){
            searchRange[0] = -1;
            searchRange[1] = -1;
        }else {
            int l = mid,r = mid;
            while(l > 0){
                if(nums[l-1] == target){
                    l--;
                }else {
                    break;
                }
            }
            while(r < n-1){
                if(nums[r+1] == target){
                    r++;
                }else {
                    break;
                }
            }

            searchRange[0] = l;
            searchRange[1] = r;
        }




        return searchRange;
    }

    public int midSearch(int[] nums,int target){
        int n = nums.length;
        int left = 0,right = n - 1;
        while(left <= right){

            int mid = (left + right)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target >= nums[0] && target < nums[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        Solution34_1 test = new Solution34_1();
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] searchRange = test.searchRange(nums, target);
        for (int i = 0; i < 2; i++) {
            System.out.println(searchRange[i]);
        }

    }

}
