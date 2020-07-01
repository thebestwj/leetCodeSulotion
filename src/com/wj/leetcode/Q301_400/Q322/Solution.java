package com.wj.leetcode.Q301_400.Q322;

/**
 * Created by white_wolf on 2020/6/28.
 *
 * @author thebestwj
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        if(amount == 0) return 0;  //坑 [1] 0
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            for(int c:coins){
                if(i==c) dp[i]=1;
                if(i>c && dp[i-c]!=0) dp[i] = dp[i]==0?dp[i-c]+1:Math.min(dp[i],dp[i-c]+1);
            }
        }
        return dp[amount]==0?-1:dp[amount];
    }
}
