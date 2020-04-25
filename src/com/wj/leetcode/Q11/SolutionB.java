package com.wj.leetcode.Q11;

/**
 * Created by white_wolf on 2020/4/18.
 *
 * @author thebestwj
 */
public class SolutionB { //双指针
    public int maxArea(int[] height) {  //BF
        int max = 0;
        int a = 0;
        int b = height.length-1;
        while (a < b) {
            int now = Math.min(height[a], height[b]) * (b - a);
            if (now > max) max = now;
            if (height[a] < height[b]) {
                a++;
            } else b--;
        }
        return max;
    }
}
