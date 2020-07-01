package com.wj.leetcode.Q101_200.Q124;

import com.wj.leetcode.util.TreeNode;

/**
 * Created by white_wolf on 2020/6/5.
 *
 * @author thebestwj
 */
//稍微化简了一下
public class SolutionB {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax  = Math.max(0, dfs(root.left));         // 左孩子贡献
        int rightMax = Math.max(0, dfs(root.right));        // 右孩子贡献
        res = Math.max(res, root.val + leftMax + rightMax); // 更新res
        return root.val + Math.max(leftMax, rightMax);      // 返回当前节点的总贡献
    }

}
