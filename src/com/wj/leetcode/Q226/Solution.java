package com.wj.leetcode.Q226;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/3.
 *
 * @author thebestwj
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
