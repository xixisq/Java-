package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-09-15 16:46
 *
 * 暴力求解
 */
public class Solution121_1 {



    public int maxProfit(int[] prices){
        int n = prices.length;
        int buy = prices[0];
        int maxProfit = 0;
        int profit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(prices[i] < prices[j]){
                    profit = prices[j] - prices[i];
                    maxProfit = Math.max(maxProfit,profit);
                }
            }

        }

        return maxProfit;
    }
}
