package com.wj.leetcode.Q892;

/**
 * Created by white_wolf on 2020/3/25.
 *
 * @author thebestwj
 */
public class Solution {
    public int surfaceArea(int[][] grid) {
        int counter = 0;
        int m = grid.length;
        if (m<=0) return 0;
        int n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) continue;
                counter = counter + 2 + grid[i][j]*4;
                if(i-1>=0){
                    counter -= Math.min(grid[i][j],grid[i-1][j]);
                }
                if(i+1<m){
                    counter -= Math.min(grid[i][j],grid[i+1][j]);
                }
                if(j-1>=0){
                    counter -= Math.min(grid[i][j],grid[i][j-1]);
                }
                if(j+1<n){
                    counter -= Math.min(grid[i][j],grid[i][j+1]);
                }
            }
        }
        return counter;
    }
}
