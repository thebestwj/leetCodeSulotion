package com.wj.leetcode.Q283;

import java.util.ArrayList;

/**
 * Created by white_wolf on 2019/10/2.
 *
 * @author thebestwj
 */

//time O(2n)
//space O(1)
public class SolutionB {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return;
        }
        ArrayList arrayList=new ArrayList();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)arrayList.add(nums[i]);
        }
        for(int i = 0; i < arrayList.size(); i++){
            nums[i] = (int) arrayList.get(i);
        }
        for (int i = arrayList.size();i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
