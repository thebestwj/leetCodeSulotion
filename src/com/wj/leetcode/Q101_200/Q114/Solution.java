package com.wj.leetcode.Q101_200.Q114;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/25.
 *
 * @author thebestwj
 */
//递归 自底向上
public class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right!=null){
            root = root.right;
        }
        root.right = temp;
    }
}
