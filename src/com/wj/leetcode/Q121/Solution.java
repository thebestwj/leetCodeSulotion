package com.wj.leetcode.Q121;

/**
 * Created by white_wolf on 2020/3/24.
 *
 * @author thebestwj
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        for (int i =  prices.length -1; i >0; i--) {
            prices[i] = prices[i] - prices[i - 1];
        }
        prices[0] = 0;
        int seenMax = 0 ;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] > 0) prices[i] += prices[i - 1];
            seenMax = Math.max(prices[i], seenMax);
        }
        return seenMax;
    }
}
