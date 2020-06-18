package com.wj.leetcode.Q1_100.Q59;

/**
 * Created by white_wolf on 2020/6/15.
 *
 * @author thebestwj
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int i = 1,x=0,y=0;
        int direction = 0;
        if(n<1) return res;
        boolean[][] visited = new boolean[n][n];
        while(i<=n*n){
            res[x][y]=i;
            i++;
            visited[x][y]=true;
            if(direction == 0){
                if( y==n-1 || visited[x][y+1]){
                    direction = 1;
                    x++;
                    continue;
                }
                y++;
            }
            if(direction == 1){
                if(x==n-1 || visited[x+1][y]){
                    direction = 2;
                    y--;
                    continue;
                }
                x++;
            }
            if(direction == 2){
                if(y==0 || visited[x][y-1]){
                    direction = 3;
                    x--;
                    continue;
                }
                y--;
            }
            if(direction == 3){
                if(x==0 || visited[x-1][y]){
                    direction = 0;
                    y++;
                    continue;
                }
                x--;
            }
        }
        return res;
    }
}
