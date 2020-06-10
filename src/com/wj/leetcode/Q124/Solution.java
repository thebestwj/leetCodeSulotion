package com.wj.leetcode.Q124;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/5.
 *
 * @author thebestwj
 */
//这个hard还是很快就做出来了dfs
public class Solution {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        maxValue(root);
        return max;
    }

    int maxValue(TreeNode root) {
        if (root == null) return 0;
        int left = maxValue(root.left);
        int right = maxValue(root.right);
        int max1 = Math.max(root.val + left, root.val + right);
        int max2 = Math.max(root.val, root.val + left + right);
        int ansForThis = Math.max(max1, max2);
        if (ansForThis > max) max = ansForThis;
        return Math.max(Math.max(root.val + left, root.val + right),root.val);
        //注意应不包括root.val + left + right，这样会有分叉
    }

}
