package com.wj.leetcode.everyday.lcof.Q3;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> storage = new HashSet<>();
        for(int i:nums){
            if(storage.contains(i)) return i;
            storage.add(i);
        }
        return -1;
    }
}
/**
 * 它考察的是程序员的沟通能力，先问面试官要时间/空间需求！！！
 * 只是时间优先就用字典，
 * 还有空间要求，就用指针+原地排序数组，
 * 如果面试官要求空间O(1)并且不能修改原数组，还得写成二分法！！！
 */
