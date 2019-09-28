package com.wj.leetcode.Q122;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if ( null == prices || prices.length <=1 ) return 0;
        for (int i = 0 ;i < prices.length - 1; i++){
            if (prices[i+1] - prices[i] > 0) {
                profit = profit + prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}