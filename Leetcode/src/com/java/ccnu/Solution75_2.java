package com.java.ccnu;
//颜色分类    双指针

public class Solution75_2 {
	public void sortColors(int[] nums){
		int len = nums.length;
		int p0 = 0,p2 = len - 1;
		for(int i = 0;i <= p2;i++){
			while(i<p2 && nums[i] == 2){//确保nums[i]!=2
				int temp = nums[i];
				nums[i] = nums[p2];
				nums[p2] = temp;
				--p2;
				
			}
			
			if(nums[i] == 0){
				int temp = nums[i];
				nums[i] = nums[p0];
				nums[p0] = temp;
				++p0;
			}
		}
	}

}
