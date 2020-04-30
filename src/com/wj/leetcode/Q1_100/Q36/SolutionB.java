package com.wj.leetcode.Q1_100.Q36;

import java.util.ArrayList;

/**
 * Created by white_wolf on 2019/10/2.
 *
 * @author thebestwj
 */
class SolutionB {
    public boolean isValidSudoku(char[][] board) {
        ArrayList[] row,column,palace;
        row = new ArrayList[9];
        column = new ArrayList[9];
        palace = new ArrayList[9];
        for(int i = 0;i < 9; i++){
            row[i] = new ArrayList();
            column[i] = new ArrayList();
            palace[i] = new ArrayList();
        }
        for(int i = 0;i < 9; i++){
            for(int j = 0;j < 9;j++){
                if(board[i][j]!='.'){
                    if(row[i].contains(board[i][j])) return false;
                    if(column[j].contains(board[i][j])) return false;
                    ArrayList palaceArray = palace[(i / 3) * 3 + (j / 3)];
                    if(palaceArray.contains(board[i][j])) return false;
                    row[i].add(board[i][j]);
                    column[j].add(board[i][j]);
                    palaceArray.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
