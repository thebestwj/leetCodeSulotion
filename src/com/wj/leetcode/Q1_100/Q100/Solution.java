package com.wj.leetcode.Q1_100.Q100;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
