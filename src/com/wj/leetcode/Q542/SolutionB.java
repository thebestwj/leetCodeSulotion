package com.wj.leetcode.Q542;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by white_wolf on 2020/4/15.
 *
 * @author thebestwj
 */
public class SolutionB {
    public int[][] updateMatrix(int[][] matrix) {  //BFS AC
        int m = matrix.length;
        int n = matrix[0].length;
        if (m <= 0 || n <= 0) return matrix;
        Set<Position> s = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                   s.add(new Position(i,j));
                }else{matrix[i][j]=-1;}
            }
        }

        int round =0;
        while(s.size()>0){
            round++;
            Set<Position> s2 = new HashSet<>();
            for (Position i:s){
                int[][] d ={{-1,0},{1,0},{0,-1},{0,1}};
                for(int j=0;j<4;j++){
                        if (i.x + d[j][0]>=0 && i.x + d[j][0]<m && i.y+d[j][1]>=0 && i.y+d[j][1]<n){
                            if(matrix[i.x+d[j][0]][i.y+d[j][1]]==-1){
                                matrix[i.x+d[j][0]][i.y+d[j][1]] = round;
                                s2.add(new Position(i.x+d[j][0],i.y+d[j][1]));
                            }

                        }
                    }
                }
            s = s2;
        }

        return matrix;
    }

    static class Position {
        public int x;
        public int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
