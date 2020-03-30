package com.wj.leetcode.Q102;

import com.wj.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/3/26.
 *
 * @author thebestwj
 */
public class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return result;
        bsp(root,0);
        return result;
    }

    public void bsp(TreeNode root,int level){
        if(level == result.size()){
            ArrayList<Integer> nl = new ArrayList<>();
            result.add(nl);
        }
        result.get(level).add(root.val);
        if(root.left!=null)bsp(root.left,level+1);
        if(root.right!=null)bsp(root.right,level+1);
    }
}
