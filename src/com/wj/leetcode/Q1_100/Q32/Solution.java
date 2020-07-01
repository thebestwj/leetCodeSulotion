package com.wj.leetcode.Q1_100.Q32;

/**
 * Created by white_wolf on 2020/6/25.
 *
 * @author thebestwj
 */
public class Solution {
    public int longestValidParentheses(String s) {
        int res = 0;
        if (s.length() < 2) {
            return 0;
        }
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = i > 1 ? (dp[i - 2] + 2) : 2;
                } else {
                    if (i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);
                    }
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
}
/*
用 dp[i] 表示以 i 结尾的最长有效括号；

    当 s.charAt(i) 为 '('时,不可能组成有效的括号，因此dp[i]= 0；

    当 s.charAt(i) 为 '）'时分两种情况

    当 s.charAt(i-1) 为 '('，那么 dp[i] = dp[i-2] + 2；

    当 s.charAt(i-1) 为 '）' 并且 s.charAt(i-dp[i-1] - 1) 为 (，那么 dp[i] = dp[i-1] + 2 + dp[i-dp[i-1]-2]；

链接：https://leetcode-cn.com/problems/longest-valid-parentheses/solution/zhan-he-dong-tai-gui-hua-liang-chong-jie-fa-by-ree/
 */