package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-09-14 16:41
 * 贪心算法
 */
public class Solution714_2 {
    public static void main(String[] args) {
        Solution714_2 test = new Solution714_2();
        int[] prices = new int[]{1,4,6,2,8,3,10,14};
        int maxProfit = test.maxProfit(prices, 3);
        System.out.println(maxProfit);
    }
    public int maxProfit(int[] prices,int fee){
        int buy = prices[0] + fee;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] + fee < buy){
                buy = prices[i] + fee;
            }else if(prices[i] > buy){
                profit +=prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;
    }
}
