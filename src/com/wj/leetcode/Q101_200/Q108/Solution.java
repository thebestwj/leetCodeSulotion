package com.wj.leetcode.Q101_200.Q108;

import com.wj.leetcode.util.TreeNode;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/3/27.
 *
 * @author thebestwj
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if (n == 0) return null;
        if (n == 1) return new TreeNode(nums[0]);
        int[] left;
        int[] right;
        if (n % 2 == 0) {
            left = new int[n / 2];
            right = new int[n / 2 - 1];

        } else {
            left = new int[n / 2];
            right = new int[n / 2];
        }
        left = Arrays.copyOfRange(nums, 0, n / 2);
        right = Arrays.copyOfRange(nums, n / 2 + 1, n);
        TreeNode res = new TreeNode(nums[n / 2]);
        res.left = sortedArrayToBST(left);
        res.right = sortedArrayToBST(right);
        return res;
    }
}
