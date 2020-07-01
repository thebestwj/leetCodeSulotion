package com.wj.leetcode.Q101_200.Q114;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/25.
 *
 * @author thebestwj
 */
//递归 自顶向下 //todo
public class SolutionC {
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode temp = root.right;
        root.right = root.left;
        TreeNode right = root.right;
        root.left = null;
        while (root.right!=null){
            root = root.right;
        }
        root.right = temp;
        flatten(right);
    }
}
