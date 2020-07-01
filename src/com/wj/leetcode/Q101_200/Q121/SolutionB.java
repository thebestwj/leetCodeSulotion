package com.wj.leetcode.Q101_200.Q121;

/**
 * Created by white_wolf on 2020/3/25.
 *
 * @author thebestwj
 */
public class SolutionB {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
