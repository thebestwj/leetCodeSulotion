package com.wj.leetcode.everyday.lcof.Q4;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
//右上开始搜索
public class SolutionB {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0) {
            if(matrix[row][col] > target) {
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
    }
}
