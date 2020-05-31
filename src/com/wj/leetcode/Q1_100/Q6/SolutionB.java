package com.wj.leetcode.Q1_100.Q6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
// 分行,变换遍历行的方向
public class SolutionB {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }

}
