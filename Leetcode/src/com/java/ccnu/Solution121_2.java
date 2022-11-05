package com.java.ccnu;

/**
 * @author ganccl
 * @create 2022-09-15 19:04
 * 一次遍历
 *
 */
public class Solution121_2 {

    public int maxProfit(int[] prices){
        int n = prices.length;
        int buy = prices[0];
        int maxProfit = 0,profit = 0;
        for (int i = 1; i < n; i++) {
            if(prices[i] < buy){
                buy = prices[i];

            }else {
                profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit,profit);
            }

        }
        return maxProfit;
    }
}
