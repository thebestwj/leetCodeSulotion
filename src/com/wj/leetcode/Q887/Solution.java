package com.wj.leetcode.Q887;

/**
 * Created by white_wolf on 2020/4/11.
 *
 * @author thebestwj
 */
//O(KNN) OT
public class Solution { //双蛋问题
    public int superEggDrop(int K, int N) {
        if (K == 0 || N == 0) return 0;
        if (K == 1) return N;
        if (N == 1) return 1;
        int[][] dp = new int[N + 1][K + 1]; //[层数][蛋数]
        for (int i = 1; i <= N; i++) { //1个蛋扔n次
            dp[i][1] = i;
        }
        for (int i = 1; i <= K; i++) { //1层扔1次
            dp[1][i] = 1;
        }
        for (int i = 2; i <= K; i++) {
            for (int j = 2; j <= N; j++) {
                dp[j][i] = Integer.MAX_VALUE;
                for (int k = 1; k <= j; k++) {
                    int temp = Math.max(dp[k-1][i - 1], dp[j - k][i]) + 1;  //转移方程
                    if (temp < dp[j][i]) dp[j][i] = temp;
                }
            }
        }
        return dp[N][K];

    }
}
