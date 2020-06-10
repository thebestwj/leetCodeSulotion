package com.wj.leetcode.everyday.lcof.Q26;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/10.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if( A==null ||B == null) return false;
        return isSame(A,B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    boolean isSame(TreeNode A,TreeNode B){
        if (B == null) return true;
        if (A == null) return false;
        if (A.val != B.val) return false;
        return isSame(A.left, B.left) && isSame(A.right, B.right);
    }
}
