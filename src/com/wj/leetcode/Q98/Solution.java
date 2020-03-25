package com.wj.leetcode.Q98;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/3/25.
 *
 * @author thebestwj
 */
public class Solution {
    //还应该确保值大于或小于所有祖先节点
//    public boolean isValidBST(TreeNode root) {
//        if (root==null) return true;
//        return (root.left == null || root.left.val < root.val) &&(root.right == null || root.right.val > root.val) && isValidBST(root.left) && isValidBST(root.right);
//    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root, java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE);
    }
    boolean dfs(TreeNode node, long min, long max) {
        return (node == null) || node.val > min && node.val < max && dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }
}
