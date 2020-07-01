package com.wj.leetcode.Q101_200.Q128;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/6/5.
 *
 * @author thebestwj
 */
//时间复杂度不为O(n)
public class SolutionB {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length < 1) return 0;
        if (nums.length == 1) return 1;
        Arrays.sort(nums);
        int max = 1;
        int now = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                now++;
            } else {
                if (now > max) {
                    max = now;
                }
                now = 1;
            }
        }
        return Math.max(max,now);
    }
}
