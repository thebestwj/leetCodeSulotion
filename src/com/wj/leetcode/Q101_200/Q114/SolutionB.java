package com.wj.leetcode.Q101_200.Q114;

import com.wj.leetcode.util.TreeNode;

import java.util.Stack;

/**
 * Created by white_wolf on 2020/6/25.
 *
 * @author thebestwj
 */
//非递归
public class SolutionB {
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> s = new Stack<>();
        while(!s.isEmpty()){
            while(root.left!=null) {
                s.push(root);
                root = root.left;
            }
            if(!s.isEmpty()){
                TreeNode node = s.pop();
                TreeNode right = node.right;
                TreeNode left = node.left;
                node.right = node.left;
                root.left = null;
                while(node.right != null) node = node.right;
                node.right = right;
                root = right;
            }
        }
    }
}
