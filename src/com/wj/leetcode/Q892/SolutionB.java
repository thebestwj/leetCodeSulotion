package com.wj.leetcode.Q892;

/**
 * Created by white_wolf on 2020/3/25.
 *
 * @author thebestwj
 */
public class SolutionB {
    public int surfaceArea(int[][] grid) { //optimized
        int N = grid.length;
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 上边露出的表面积
                res += i-1 >= 0 ? Math.max(grid[i][j] - grid[i-1][j], 0) : grid[i][j];
                // 下边露出的表面积
                res += i+1 < N ? Math.max(grid[i][j] - grid[i+1][j], 0) : grid[i][j];
                // 左边露出的表面积
                res += j-1 >= 0 ? Math.max(grid[i][j] - grid[i][j-1], 0) : grid[i][j];
                // 右边露出的表面积
                res += j+1 < N ? Math.max(grid[i][j] - grid[i][j+1], 0) : grid[i][j];
                // 顶部、底部的表面积
                res += 2 * (grid[i][j] > 0 ? 1 : 0);
            }
        }
        return res;
    }

}
