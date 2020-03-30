package com.wj.leetcode.Q101;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/3/27.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isSym(root.left,root.right);
    }

    boolean isSym(TreeNode leftTree,TreeNode rightTree){
        if (leftTree==null && rightTree==null) return true;
        if (leftTree==null || rightTree==null) return false;
        return (leftTree.val == rightTree.val && isSym(leftTree.left,rightTree.right) && isSym(leftTree.right,rightTree.left));
    }
}
