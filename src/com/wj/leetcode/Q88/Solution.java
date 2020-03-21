package com.wj.leetcode.Q88;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/3/20.
 *
 * @author thebestwj
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
