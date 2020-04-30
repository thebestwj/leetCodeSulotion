package com.wj.leetcode.Q1_100.Q11;

/**
 * Created by white_wolf on 2020/4/18.
 *
 * @author thebestwj
 */
public class Solution {
    public int maxArea(int[] height) {  //BF
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int now = Math.min(height[i], height[j]) * Math.abs(i - j);
                if (now > max) max = now;
            }
        }
        return max;
    }
}
