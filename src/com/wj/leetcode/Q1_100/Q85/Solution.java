package com.wj.leetcode.Q1_100.Q85;

/**
 * Created by white_wolf on 2020/6/25.
 *
 * @author thebestwj
 */
public class Solution { //todo
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        if (n < 1) return 0;
        int m = matrix[0].length;
        if (m < 1) return 0;
        int[][] dp = new int[n][m];
        int max = 0;
        if(matrix[0][0]=='1') {
            dp[0][0] = 1;
            max = 1;
        }
        for (int i = 1; i < n; i++) {
            if(matrix[i][0]=='1'){
                dp[i][0] = dp[i-1][0]+1;
                max = Math.max(max,dp[i][0]);
            }
        }
        for (int i = 1; i < m; i++) {
            if(matrix[0][i]=='1'){
                dp[0][i] = dp[0][i-1]+1;
                max = Math.max(max,dp[0][i]);
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(matrix[i][j]=='1'){
                        if(matrix[i-1][j]=='1' && matrix[i][j-1]=='1') {
                            if(matrix[i-1][j-1] =='1'){
                                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + 1 - dp[i - 1][j - 1];
                            }
                            else dp[i][j] = 1 + Math.max(dp[i - 1][j],dp[i][j-1]);
                        }else if (matrix[i-1][j]=='1'){
                            dp[i][j] = dp[i - 1][j] + 1 - dp[i - 1][j - 1];
                        }else if (matrix[i][j-1]=='1'){
                            dp[i][j] =  dp[i][j - 1] + 1 - dp[i - 1][j - 1];
                        }else dp[i][j] = 1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(dp[i][j]);
//                System.out.print(",");
//            }
//            System.out.println();
//        }
        return max;
    }
}
