package com.wj.leetcode.Q718;

/**
 * Created by white_wolf on 2020/7/1.
 *
 * @author thebestwj
 */
public class Solution {
    public int findLength(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        if(a==0 || b==0) return 0;
        int[][] dp = new int[a][b];
        int max = 0;
        for(int i = 0;i<a;i++){
            dp[i][0] = A[i]==B[0]? 1:0;
            max = Math.max(max,dp[i][0]);
        }

        for(int i = 0;i<a;i++){
            dp[0][i] = A[0]==B[i]? 1:0;
            max = Math.max(max,dp[0][i]);
        }

        for(int i =1;i<a;i++){
            for(int j=1;j<b;j++){
                if(A[i]==B[j]) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = 0;
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
}
