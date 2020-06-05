package com.wj.leetcode.Q437;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/3.
 *
 * @author thebestwj
 */
//与官方解法不同
//从上往下递归遍历，分累计之前的和不累计之前的和
public class Solution {

    public int pathSum(TreeNode root, int sum) {
        int res = 0;
        if (root == null) return 0;
        if (root.val == sum) res++;
        return res + pathSumHelper(root.left, root.val, sum)
                + pathSumHelper(root.right, root.val, sum)
                + pathSum(root.right, sum)
                + pathSum(root.left, sum);
    }

    public int pathSumHelper(TreeNode root, int acc, int sum) {
        int res = 0;
        if (root == null) return 0;
        if (acc + root.val == sum) res++;
        return res + pathSumHelper(root.left, acc + root.val, sum)
                + pathSumHelper(root.right, acc + root.val, sum);
    }

}
