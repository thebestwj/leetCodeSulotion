package com.wj.leetcode.everyday.lcof.Q68_1;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
//利用二叉搜索树的性质
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(p.val>root.val && q.val>root.val) return  lowestCommonAncestor(root.right,p,q);
        if(p.val<root.val && q.val<root.val) return  lowestCommonAncestor(root.left,p,q);
        return root;
    }
}
