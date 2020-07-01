package com.wj.leetcode.Q1_100.Q10;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
//https://leetcode-cn.com/problems/regular-expression-matching/solution/10-zheng-ze-biao-da-shi-pi-pei-by-ming-zhi-shan-yo/
public class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean [m+1][n+1];
        dp[0][0] = true;
        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(p.charAt(j-1) != '*'){
                    dp[i][j] = match(s, p, i, j) && dp[i - 1][j - 1];
                }else{
                    dp[i][j] = match(s,p,i,j-1) ? (dp[i][j-2] || dp[i-1][j]) : dp[i][j-2];
                }
            }
        }
        return dp[m][n];

    }
    public boolean match(String s, String p, int i, int j) {
        if (i == 0) return false;
        if (p.charAt(j - 1) == '.') return true;
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
