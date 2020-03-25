package com.wj.leetcode.everyday;

/**
 * Created by white_wolf on 2020/3/24.
 *
 * @author thebestwj
 */
public class TheMasseuseLcci { //动态规划
    public int massage(int[] nums) {
        if (nums.length <= 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] history = new int[nums.length];
        history[0] = nums[0];
        history[1] = Math.max(nums[0], nums[1]);
        if (nums.length == 2) return history[1];
        int i = 2;
        while (i < nums.length) {
            history[i] = Math.max(history[i - 1], history[i - 2] + nums[i]);
            i++;
        }
        return history[i];
    }

    public int massage2(int[] nums) { //优化空间n1 ,不记录历史
        if (nums.length <= 0) return 0;
        if (nums.length == 1) return nums[0];
        int a,b;
        a = nums[0];
        b = Math.max(nums[0], nums[1]);
        if (nums.length == 2) return b;
        int i = 2;
        while (i < nums.length) {
            int temp = b;
            b = Math.max(b, a + nums[i]);
            a = temp;
            i++;
        }
        return b;
    }
    public int massage3(int[] nums) { //优化简约
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = Math.max(b, a + nums[i]);
            a = b;
            b = c;
        }
        return b;
    }
}
