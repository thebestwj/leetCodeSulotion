package com.wj.leetcode.Q999;

/**
 * Created by white_wolf on 2020/3/26.
 *
 * @author thebestwj
 */
public class Solution {
    public int numRookCaptures(char[][] board) {
        int x = 0, y = 0;
        int result = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {  //可优化，找到R就开始模拟判断
                    x = i;
                    y = j;
                }
            }
        }

        for (int i = x; i >= 0; i--) {
            if (board[i][y] == 'p') {
                result++;
                break;
            }
            if (board[i][y] == 'B') break;
        }

        for (int i = x; i < 8; i++) {
            if (board[i][y] == 'p') {
                result++;
                break;
            }
            if (board[i][y] == 'B') break;
        }

        for (int i = y; i < 8; i++) {
            if (board[x][i] == 'p') {
                result++;
                break;
            }
            if (board[x][i] == 'B') break;
        }

        for (int i = y; i >= 0; i--) {
            if (board[x][i] == 'p') {
                result++;
                break;
            }
            if (board[x][i] == 'B') break;
        }
        return result;
    }
}
