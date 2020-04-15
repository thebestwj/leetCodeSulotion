package com.wj.leetcode.Q542;

/**
 * Created by white_wolf on 2020/4/15.
 *
 * @author thebestwj
 */
public class Solution {
    public int[][] updateMatrix(int[][] matrix) {  //brute force
        int m = matrix.length;
        int n = matrix[0].length;
        if( m<=0 || n<=0) return null;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    int min = Integer.MAX_VALUE;
                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < n; l++) {
                            int now = Math.abs(k - i) + Math.abs(l - j);
                            if(matrix[k][l]==0 && (now <min)){
                                min = now;
                            }
                        }
                    }
                    matrix[i][j] = min;
                }
            }
        }
        return matrix;
    }
}
