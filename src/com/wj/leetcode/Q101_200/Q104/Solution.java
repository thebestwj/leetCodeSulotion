package com.wj.leetcode.Q101_200.Q104;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/3/25.
 *
 * @author thebestwj
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
