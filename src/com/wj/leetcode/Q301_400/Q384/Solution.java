package com.wj.leetcode.Q301_400.Q384;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class Solution {

    int[] original;

    public Solution(int[] nums) {
        original = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return original;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        List<Integer> index = new ArrayList<>();
        int[] result  = new int[original.length];
        for(int i=0;i<original.length;i++){
            index.add(i);
        }
        Random random=new Random();

        for(int i=0;i<original.length;i++){
            int now =random.nextInt(original.length-i);
            result[i]=original[index.get(now)];
            index.remove(now);
        }
        return  result;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */