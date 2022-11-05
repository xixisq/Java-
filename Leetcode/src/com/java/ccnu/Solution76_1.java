package com.java.ccnu;



public class Solution76_1 {
	public String minWindow(String s,String t){
		if(s == null || s == "" || t == null || t == "" || s.length() < t.length()){
			return "";
		}
		int[] need = new int[128];
		int[] have = new int[128];
		
		for(int i = 0;i < t.length();i++){
			need[t.charAt(i)]++; //将字符转化为ASCII码，例如'a'=97
		}
		int left = 0,right = 0,min = s.length() + 1,count = 0,start = 0;
		while(right < s.length()){
			char r = s.charAt(right);
			//字符不符合要求
			if(need[r] == 0){
				right++;
				continue;
			}
			
			if(have[r] < need[r]){
				count++;
			}
			have[r]++;
			//循环当中右指针每次都要移动
			right++;
			while(count == t.length()){
				if(right - left < min){
					min = right - left;
					start = left;
				}
				
				char l = s.charAt(left);
				if(need[l] == 0){
					left++;
					continue;
				}
				
				if(have[l] == need[l]){
					count--;
				}
				have[l]--;
				left++;
			}
			
		}
		if(min == s.length() + 1){
			return "";
		}
		return s.substring(start,start + min);
	}
//	public static void main(String[] args) {
//		String s = "abcdaa";
//		int[] need = new int[128];
//		for(int i = 0;i < s.length();i++){
//			need[s.charAt(i)]++;
//		}
//		System.out.println(need[97]);
//	}
}
