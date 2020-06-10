package com.wj.leetcode.everyday.lcof.Q46;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
//dp
public class Solution {
    public int translateNum(int num) {
        if(num<10) return 1;
        if(num>=10 && num<=25) return 2;
        if(num>=26 && num<100) return 1;
        int[] digit = new int[10];
        int i=0;
        while(num>0){
            digit[i] = num % 10;
            num = num/10;
            i++;
        }

        int[] dp = new int[i];
        dp[0] = 1;
        dp[1]= (digit[1]*10 + digit[0] <=25  && digit[1]>=1 ) ?2:1;   //注意两位数的条件
        for (int j = 2; j < i; j++) {
            if(digit[j]*10 + digit[j-1] <=25 && digit[j]>=1) dp[j] = dp[j-1] + dp[j-2]; //注意两位数的条件
            else dp[j] = dp[j-1] ;
        }
        return dp[i-1];

        //只与两个状态有关，可以优化一下
    }
}
