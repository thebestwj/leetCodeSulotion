package com.wj.leetcode.everyday.lcof.Q7;

import com.wj.leetcode.util.TreeNode;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length<1) return null;
        int rootIndex = 0;
        for (int i = 0; i < preorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                rootIndex = i;
                break;
            }
        }
        TreeNode head = new TreeNode(preorder[0]);
        head.left = buildTree(Arrays.copyOfRange(preorder,1,1+rootIndex),Arrays.copyOfRange(inorder,0,1+rootIndex));
        head.right = buildTree(Arrays.copyOfRange(preorder,rootIndex+1,preorder.length),Arrays.copyOfRange(inorder,rootIndex+1,preorder.length));
        return head;
    }
}
