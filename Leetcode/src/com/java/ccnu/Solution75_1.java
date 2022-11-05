package com.java.ccnu;
//颜色分类      单指针
public class Solution75_1 {
	public void sortColors(int[] nums){
		int len = nums.length;
		int ptr = 0;
		for(int i = 0;i < len;i++){
			if(nums[i] == 0){
				int temp = nums[ptr];
				nums[ptr] = nums[i];
				nums[i] = temp;
				++ptr;
			}
		}
		
		for(int i = ptr;i < len;i++){
			if(nums[i] == 1){
				int temp = nums[ptr];
				nums[ptr] = nums[i];
				nums[i] = temp;
				++ptr;
			}
		}
		
	}

}
