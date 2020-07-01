package com.wj.leetcode.Q101_200.Q200;

import java.util.*;

/**
 * Created by white_wolf on 2020/4/20.
 *
 * @author thebestwj
 */
public class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m<=0) return 0;  //!!!
        int n = grid[0].length;
        int ans = 0;
        List<Pos> l = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    l.add(new Pos(i, j));
                }
            }
        }
        while (l.size() > 0) {
            Pos p = l.get(0);
            if (grid[p.x][p.y] == '-') {
                l.remove(0);
                continue;
            }
            grid[p.x][p.y] = '-';
            Queue<Pos> q = new LinkedList<>();
            q.offer(p);
            while (q.size() > 0) {
                p = q.poll();
                int[][] d = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
                for (int[] dx : d) {
                    int x = p.x + dx[0];
                    int y = p.y + dx[1];
                    if (x >= 0 && x < m && y >= 0 && y < n) {
                        if (grid[x][y] == '1') {
                            ans--;
                            grid[x][y] = '-';
                            if(!q.contains(new Pos(x, y))) q.offer(new Pos(x, y));
                        }
                    }
                }
            }
        }
        for (char[] c : grid) {
            for (char c1 : c) {
                System.out.println(c1);
            }
        }
        System.out.println();
        return ans;
    }

    final class Pos {
        public final int x;
        public final int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
