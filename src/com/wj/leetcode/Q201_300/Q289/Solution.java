package com.wj.leetcode.Q201_300.Q289;

/**
 * Created by white_wolf on 2020/4/2.
 *
 * @author thebestwj
 */
public class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        if (m <= 0) return;
        int n = board[0].length;
        int[][] count = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count[i][j] += valid(i - 1, j - 1, board);
                count[i][j] += valid(i, j - 1, board);
                count[i][j] += valid(i + 1, j - 1, board);
                count[i][j] += valid(i - 1, j, board);
                count[i][j] += valid(i + 1, j, board);
                count[i][j] += valid(i - 1, j + 1, board);
                count[i][j] += valid(i, j + 1, board);
                count[i][j] += valid(i + 1, j + 1, board);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    if (!(count[i][j] == 2 || count[i][j] == 3)) board[i][j] = 0;
                } else {
                    if (count[i][j] == 3) board[i][j] = 1;
                }
            }
        }

    }

    public int valid(int x, int y, int[][] board) {
        int m = board.length;
        int n = board[0].length;
        if (x >= 0 && x < m && y >= 0 && y < n) {
            return board[x][y];
        } else return 0;
    }
}
