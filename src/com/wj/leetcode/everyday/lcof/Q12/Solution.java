package com.wj.leetcode.everyday.lcof.Q12;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board==null) return false;
        if(word==null|| word.length()<1) return false;
        int m = board.length;
        if(m<1) return false;
        int n = board[0].length;
        if(n<1) return false;

        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == word.charAt(0)){
                        visited[i][j] = true;
                        if (find(board,i,j,m,n,word.substring(1),visited)) return true;
                        visited[i][j] = false;
                }
            }
        }
        return false;
    }

    boolean find(char[][] board,int x,int y,int m,int n,String word,boolean[][] visited){
        if(x<0 || y<0 || x>=m || y>=n) return false;
        if(word.length()<1) return true;
            int[][] delta = {{-1,0},{1,0},{0,-1},{0,1}};
            boolean b = false;
            for (int i = 0; i < 4; i++) {
                int dx = x - delta[i][0];
                int dy = y - delta[i][1];
                if(dx<0 || dy<0 || dx>=m ||dy>=n || visited[dx][dy]) continue;
                if(board[dx][dy] == word.charAt(0)) {
                    visited[dx][dy] = true;
                   if (find(board, dx, dy, m, n, word.substring(1),visited)) return true;
                    visited[dx][dy] = false;
                }
            }
        return false;
    }
}
