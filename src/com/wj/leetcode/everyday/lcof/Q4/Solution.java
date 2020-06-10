package com.wj.leetcode.everyday.lcof.Q4;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
//每一行搜索可以优化为二分
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null) return false;
        int m = matrix.length;
        if(m<1) return false;
        int n = matrix[0].length;
        if(n<1) return false;
        int i = 0;
        for (i = 0; i < m; i++) {
            if(matrix[i][n-1]==target || matrix[i][0]==target) return true;
            if(matrix[i][0]>target) return false;
            if(matrix[i][n-1]<target) continue;
            for(int j=1;j<n-1;j++){
                if(matrix[i][j]==target) return true;
                if(matrix[i][j]>target) break;
            }
        }
        return false;
    }
}
