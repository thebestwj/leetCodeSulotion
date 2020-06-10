package com.wj.leetcode.Q1_100.Q54;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/6/5.
 *
 * @author thebestwj
 */
//按层遍历
//注意边界条件
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int level_n = n / 2 + n % 2;
        int level_m = m / 2 + m % 2;
        int level = Math.min(level_n, level_m);
        for (int i = 0; i < level; i++) {

            for (int j = i; j < n - i; j++) {
                res.add(matrix[i][j]);
            }

            for (int j = i + 1; j < m - i; j++) {
                res.add(matrix[j][n - i - 1]);
            }

            // 下半部分有重复打印可能所以要加限制条件
            if (m - i - 1 != i) {
                for (int j = n - i - 1 - 1; j >= i; j--) {
                    res.add(matrix[m - i - 1][j]);
                }
            }

            if (n - i - 1 != i) {
                for (int j = m - i - 1 - 1; j >= i + 1; j--) {
                    res.add(matrix[j][i]);
                }
            }
        }

        return res;
    }

}
