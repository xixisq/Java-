package com.java.ccnu;

public class Solution283_2 {
	public void moveZeroes(int[] nums){
		int left = 0,right = 0;
		int len = nums.length;
		while(right < len){
			if(nums[right] != 0){
				swap(nums,left,right);
				++left;//在交换位置之后左指针移动
			}
			++right;//右指针一直移动
		}
	}
	
	public void swap(int[] nums,int left,int right){
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}

}
