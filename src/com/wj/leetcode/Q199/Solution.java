package com.wj.leetcode.Q199;

import com.wj.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/4/22.
 *
 * @author thebestwj
 */
public class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {

        if(root==null) return result;
        result.add(root.val);
        visit(root,1);
        return result;
    }

    public void addResult(TreeNode node,int level){  //右中左序
        if(result.size()<level) result.add(node.val);
    }
    public void visit(TreeNode node,int level){
        if(node.right!=null) {
            addResult(node.right,level+1);
            visit(node.right,level+1);
        }
        else addResult(node,level);
        if(node.left!=null) {
            addResult(node.left,level+1);
            visit(node.left,level+1);
        }
    }

}
