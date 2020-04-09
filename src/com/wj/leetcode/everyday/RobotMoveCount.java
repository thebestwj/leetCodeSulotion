package com.wj.leetcode.everyday;

/**
 * Created by white_wolf on 2020/4/8.
 *
 * @author thebestwj
 */
public class RobotMoveCount {
    public int movingCount(int m, int n, int k) {
        boolean[][] isValid = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                isValid[i][j] = isVaild(i, j, k);
                boolean condition = i == 0 && j == 0;
                if (i - 1 >= 0) condition = isValid[i - 1][j];  //处理边界
                if (j - 1 >= 0) condition |= isValid[i][j - 1];
                isValid[i][j] &= condition;
                count = isValid[i][j] ? count + 1 : count;
            }
        }
        return count;
    }

    public boolean isVaild(int x, int y, int k) {
        if (x < 0 || y < 0) return false;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        while (y > 0) {
            sum += y % 10;
            y = y / 10;
        }
        return sum <= k;
    }

    public int movingCount2(int m, int n, int k) {  //优化
        boolean[][] isValid = new boolean[m][n];
        int count = 1;
        isValid[0][0] = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0 || !isVaild(i, j, k)) continue;
                if (i - 1 >= 0) isValid[i][j] |= isValid[i - 1][j];
                if (j - 1 >= 0) isValid[i][j] |= isValid[i][j - 1];
                count = isValid[i][j] ? count + 1 : count;
            }
        }
        return count;
    }

    public int movingCount3(int m, int n, int k) {  //优化
        return 0;
        //todo
    }
}
